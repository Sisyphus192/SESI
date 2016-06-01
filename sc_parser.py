class SCParser(object):
    # Save the path and open the file so we know it exists
    def __init__(self, path):
        self.path = path
        self.file = open(path, 'r')
        self.tokens = []

    # Function to convert strings to the appropriate type
    def process_token(self, token):
        # If token is the string 'true' or 'false' then return True or False respectively
        if token == "true":
            return True
        if token == "false":
            return False
        # If the token is an open or shut bracket, then return it as a string:
        if token in "{}":
            return token
        # If the string is only alpha, then return it
        if token.isalpha():
            return token
        # If the string is alpha with quotes, then remove the quotes and return it
        #if token.replace('"', '').isalpha():
        if '"' in token:
            return token.replace('"', '')
        # If token has an open or shut parenthesis, then it's a list and requires extra processing
        if "(" in token or ")" in token:
            # Now we have a bit of extra work as not all sets are comma separated
            # First, remove the first and last character (the parenthesis)
            token = token[1:-1]
            # Then, remove all commas
            token = token.replace(',', '')
            # Then, split on spaces
            token_list = token.split(' ')
            # Finally, recursively parse each element
            return [self.process_token(token) for token in token_list]
        # Try casting it as a float.  If it fails, return string instead.
        try:
            return float(token)
        except:
            return token

    # Tokenize this line if it has any tokens and return them
    # Otherwise, return return nothing
    def line_has_tokens(self, line):
        if len(line) == 0:
            return
        # This line should have tokens in it, so let's find them
        unprocessed_tokens = []
        tmp_str = ""
        # State change to determine if we are in a list or set
        is_in_list_or_quote = False
        # For each character in the line...
        for char in line:
            # ...if the character is a whitespace character
            # (and not in a list or quote description)...
            if char.isspace() and not is_in_list_or_quote:
                # ...and if the we have previously seen a non-whitespace character...
                if len(tmp_str) > 0:
                    # ...then store it as we have found a token
                    unprocessed_tokens.append(tmp_str)
                    tmp_str = ""
                else:
                    # ...then do nothing as we are walking over consecutive spaces
                    pass
            # ...if the character is not a whitespace character (or we are in a list description)...
            else:
                # Check to see if this is the beginning of a list or quote description
                # (not going to work for nested lists)
                if char == "(":
                    is_in_list_or_quote = True
                elif char == ")":
                    is_in_list_or_quote = False
                if char == '"':
                    is_in_list_or_quote = not is_in_list_or_quote
                # ...then append it to the string
                tmp_str += char
        # Add the last token created to the unprocessed list
        unprocessed_tokens.append(tmp_str)
        # Process the tokens before returning them (to determine their type)
        return [self.process_token(token) for token in unprocessed_tokens]

    # Iterate over the lines in the file until we find one that has tokens, and return the tokens
    def get_next_line(self):
        # Get the next line, if it throws an error, then we have reached the end of file
        try:
            line = next(self.file)
        except:
            return
        # Stripping it first should clean up all empty lines
        tokens = self.line_has_tokens(line.strip())
        # If this line has tokens, return them.
        if tokens:
            return tokens
        # Otherwise, call this function again
        return self.get_next_line()

    # Get the next token for parsing
    def next_token(self):
        # If we have previously found tokens, just get the next one in the list
        if len(self.tokens) > 0:
            return self.tokens.pop(0)
        # Otherwise, continue looking over the rest of the file until we find another token
        tokens = self.get_next_line()
        # If we have tokens, we can call ourselves again (no sense duplicating code)
        if tokens:
            self.tokens = tokens
            return self.next_token()

    # Process a dictionary of key-value pairs
    def process_dict(self):
        rtn_val = {}
        while True:
            key = self.next_token()
            # If the key "}", then we are done with this dictionary and can return what we have
            if key == "}":
                return rtn_val
            value = self.next_token()
            # If the value is "{", then we need to parse it's dictionary
            if value == '{':
                value = self.process_dict()
            # Record the key-value pair
            rtn_val[key] = value

    # Process the galatic objects
    def process_object(self):
        obj_type = self.next_token()
        # This means we are out of tokens and can end execution
        if obj_type is None:
            return
        obj_name = self.next_token()
        # The next token should probably be the start of the dictionary
        if self.next_token() == "{":
            obj_data = self.process_dict()
        # But if it's not, then return what we have
        else:
            obj_data = {}
        return {'type': obj_type, 'name': obj_name, 'data': obj_data}

    # This function will process the file and return a list of objects
    def process(self):
        rtn_val = []
        while True:
            obj = self.process_object()
            if obj:
                rtn_val.append(obj)
            else:
                break
        return rtn_val
