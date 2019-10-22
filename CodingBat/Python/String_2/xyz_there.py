#Return True if the given string contains an appearance of "xyz" where the xyz is not directly preceded by a (.). so "xxyz" counts but "x.xyz" does not.
def xyz_there(str):
    exist=False
    temp=""
    position=0
    x_pos=0
    for char in str:
        if char=="x":
            temp=char
            x_pos=position
            position+=1
        elif char=="y" and temp=="x":
            temp+=char
            position+=1
        elif temp=="xy" and char=="z":
            position+=1
            if x_pos==0:
                temp=""
                exist=True
            elif str[x_pos-1]!=".":
                temp=""
                exist=True
        else:
            position+=1
    return exist