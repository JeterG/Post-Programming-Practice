#Given a string, return a new stirng made of eveyr other char starting with the first, so "Hello" yields "Hlo".
def string_bits(str):
    x=""
    for i in range(len(str)):
        if i%2==0:
            x+=str[i]
    return x