#given a string, return a new string where the first and last chars have been exchanged.
def front_back(str):
    x=""
    l=0
    for i in str:
        if l==0:
            l+=1
            x=x+str[len(str)-1]
        elif l == (len(str) -1):
            x=x+str[0]
            l+=1
        else:
            x=x+str[l]
            l+=1
    return x