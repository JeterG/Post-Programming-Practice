#Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front.
def front_times(str, n):
    if len(str)>=3:
        x=""
        y=str[:3]
        for i in range(n):
            x+=y
        return x
    else:
        x=""
        for i in range(n):
            x+=str
        return x