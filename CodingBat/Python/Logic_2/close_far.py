#Given three ints, a b c, return True if one of b or c is "close" (differing from a by at most 1), while the other is "far", differing from both other values by 2 or more. Note: abs(num) computes the absolute value of a number.
def close_far(a, b, c):
    if close(a,b):
        return far(a,c)and far(b,c)
    elif close(a,c):
        return far(a,b) and far(b,c)
def close(a,b):
    if abs(a-b)<=1:
        return True
    return False
def far(a,b):
    if abs(a-b)>=2:
        return True
    return False