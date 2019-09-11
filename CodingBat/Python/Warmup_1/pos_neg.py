#Given 2 int values return True if one is negative and one is positive. Except if the parameter "negative" is True, then return True only if both are negative.
def pos_neg(a, b, negative):
    if negative == True:
        if abs(a) != a and abs(b) !=b :
            return True
        return False
    else:
        if abs(a) != a and abs(b) != b:
            return False
        elif abs(a) == a and abs(b) == b:
            return False
        return True