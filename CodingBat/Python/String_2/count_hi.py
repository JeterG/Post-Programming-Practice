#Return the number of times that the string "hi" appears anywhere in the given string.
def count_hi(str):
    x=""
    count=0
    for char in str:
        if char =="h":
            x=char
        elif char =="i" and x=="h":
            x=""
            count+=1
    return count
#print(count_hi("ABChihi"))