#Given a string, return a string where for every char in the original, there are 2 chars.
def double_char(str):
    x=""
    for char in str:
        x+=char+char
    return x

print(double_char("hello"))