class SC_Parser(object):
	# Save the path and open the file so we know it exists
	def __init__(self, path):
		self.path = path
		self.file = open(path, 'r')
		self.tokens = []
	
	# Function to convert strings to the appropriate type
	def processToken(self, token):
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
			tokenList = token.split(' ')
			# Finally, recursively parse each element
			return [self.processToken(token) for token in tokenList]
		# Try casting it as a float.  If it fails, return string instead.
		try:
			return float(token)
		except:
			return token
	
	# Tokenize this line if it has any tokens and return them
	# Otherwise, return return nothing
	def lineHasTokens(self, line):
		if len(line) == 0:
			return
		# This line should have tokens in it, so let's find them
		unprocessedTokens = []
		tokens = []
		tmpStr = ""
		# State change to determine if we are in a list or set
		isInListOrQuote = False
		# For each character in the line...
		for char in line:
			# ...if the character is a whitespace character (and not in a list or quote description)...
			if char.isspace() and not isInListOrQuote:
				# ...and if the we have previously seen a non-whitespace character...
				if len(tmpStr) > 0:
					# ...then store it as we have found a token
					unprocessedTokens.append(tmpStr)
					tmpStr = ""
				else:
					# ...then do nothing as we are walking over consecutive spaces
					pass
			# ...if the character is not a whitespace character (or we are in a list description)...
			else:
				# Check to see if this is the beginning of a list or quote description (not going to work for nested lists)
				if char == "(":
					isInListOrQuote = True
				elif char == ")":
					isInListOrQuote = False
				if char == '"':
					isInListOrQuote = not isInListOrQuote
				# ...then append it to the string
				tmpStr += char
		# Add the last token created to the unprocessed list
		unprocessedTokens.append(tmpStr)
		# Process the tokens before returning them (to determine their type)
		return [self.processToken(token) for token in unprocessedTokens]
	
	# Iterate over the lines in the file until we find one that has tokens, and return the tokens
	def getNextLine(self):
		# Get the next line, if it throws an error, then we have reached the end of file
		try:
			line = next(self.file)
		except:
			return
		# Stripping it first should clean up all empty lines
		tokens = self.lineHasTokens(line.strip())
		# If this line has tokens, return them.
		if tokens:
			return tokens
		# Otherwise, call this function again
		return self.getNextLine()
	
	# Get the next token for parsing
	def nextToken(self):
		# If we have previously found tokens, just get the next one in the list
		if len(self.tokens) > 0:
			return self.tokens.pop(0)
		# Otherwise, continue looking over the rest of the file until we find another token
		tokens = self.getNextLine()
		# If we have tokens, we can call ourselves again (no sense duplicating code)
		if tokens:
			self.tokens = tokens
			return self.nextToken()
	
	# Process a dictionary of key-value pairs
	def processDict(self):
		rtnVal = {}
		while True:
			key = self.nextToken()
			# If the key "}", then we are done with this dictionary and can return what we have
			if key == "}":
				return rtnVal
			value = self.nextToken()
			# If the value is "{", then we need to parse it's dictionary
			if value == '{':
				value = self.processDict()
			# Record the key-value pair
			rtnVal[key] = value
	
	# Process the galatic objects
	def processObject(self):
		objType = self.nextToken()
		# This means we are out of tokens and can end execution
		if objType is None:
			return
		objName = self.nextToken()
		# The next token should probably be the start of the dictionary
		if self.nextToken() == "{":
			objData = self.processDict()
		# But if it's not, then return what we have
		else:
			objData = {}
		return {'type': objType, 'name': objName, 'data': objData}
	
	# This function will process the file and return a list of objects
	def process(self):
		rtnVal = []
		while True:
			obj = self.processObject()
			if obj:
				rtnVal.append(obj)
			else:
				break
		return rtnVal
