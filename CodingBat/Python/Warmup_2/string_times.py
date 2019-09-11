#Given a string and a non-negative int n, return a larger string that is n copies of the original string.
def string_times(str, n):
    x=""
    for i in range(n):
        x+=str
    return x