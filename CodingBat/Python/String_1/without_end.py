#Given a string, return a version without hte first and last char, so "Hello" yields "ell". the string length will be at least 2.
def without_end(str):
    return str[1:len(str)-1]