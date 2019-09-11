#Given a string, return a new string where not has been added to the front. However, if the string already begins with "not", return the string unchanged.
def not_string(str):
    if "not" in str:
        if str[0] == "n" and str[1] == "o" and str[2] == "t":
            return str
    return "not "+str