#Given a string, we'll say that the front is the first 3 chars of the string. If the string lenght is less than 3, the front is whatever is ther. Return a new string which is 3 copies of the front.
def front3(str):
    if len(str)<=3:
        return str+str+str
    else:
        return str[0:3]+str[0:3]+str[0:3]