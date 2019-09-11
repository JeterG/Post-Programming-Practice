#Given a non-empty string like "Code return a string like CCoCodCode"
#The splosion is copying the string over on it self, the number of times equal to the length of the original string. With the number of characters being equal to the number of the iteration
def string_splosion(str):
    x=""
    for i in range(len(str)):
       x+=str[:i+1]
    return x