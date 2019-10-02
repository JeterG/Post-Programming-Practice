#Given a non-negative number "num", return True if num is iwthin 2 of a multiple of 10. Note: (a%nb) is the remainder of dividing a by b, so (7%5) is 2.
def near_ten(num):
    if num == 0:
        return True
    elif (num % 10)<=2 or (num % 10)>=8:
        return True
    return False