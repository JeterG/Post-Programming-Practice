#Given three ints, a b c, return True if one of b or c is "close" (differing from a by at most 1), while the other is "far", differing from both other values by 2 or more. Note: abs(num) computes the absolute value of a number.
def close_far(a, b, c):
    if b>a and b-a==1 and c>b and c-b>=2:
        return True
    elif c>a and c-a==1 and b>c and b-c>=2:
        return True
    elif a>c and a-c==1 and c>b and c-b>=2:
        return True
    elif a>b and a-b==1 and b>c and b-c>=2:
        return True
    return False
    