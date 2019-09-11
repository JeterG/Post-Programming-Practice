#Given a non-empty string and an int n, return a new string where the char at the index n has been removed. The value of n will be a valid index of a char in the origional string (i.e. n will be in the reange 0..len(str)-1 inclusive).
def missing_char(str,n):
    i=0
    x=""
    for l in str:
        if i==n:
            i+=1
        else:    
            x=x+str[i]
            i+=1
    return x