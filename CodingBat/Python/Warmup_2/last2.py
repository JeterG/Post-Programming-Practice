#Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
#The number of times the last 2 characters appear -1 is the answer returned!
def last2(str):
    count=0
    if len(str)>=2:
        x=""+str[-2]+str[-1]
        z=0
        for i in range(len(str)-1):
            y=str[z]+str[z+1]
            z+=1
            if y == x:
                count+=1
    if count==0:
        return 0                
    return count-1