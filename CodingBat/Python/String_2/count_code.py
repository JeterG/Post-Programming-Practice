#Return the numer of time that the string "code" appears anywhere in the given string, except we'll accept any letter for the "d" so cope and cooe count.
def count_code(str):
    count=0
    x=""
    d=0
    for char in str:
        if char=="c":
            x=char
        elif char=="o" and x=="c":
            x+=char
        elif x=="co" and d==1 and char=="e":
            x=""
            d=0
            count+=1
        elif x=="co":
            d=1
    return count