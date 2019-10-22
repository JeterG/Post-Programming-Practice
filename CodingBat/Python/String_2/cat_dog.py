#Return True if the string cat and dog appear the same number of times in the given string.
def cat_dog(str):
    cDog=0
    cCat=0
    temp=""
    for char in str:
        if char=="c":
            temp=char
        elif char=="d":
            temp=char
        elif char=="a" and temp=="c":
            temp+=char
        elif char=="o" and temp=="d":
            temp+=char
        elif temp=="ca" and char=="t":
            cCat+=1
            temp=""
        elif temp=="do" and char=="g":
            cDog+=1
            temp=""
    return cDog==cCat