#Given two strings, return True if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: s.lower() returns the lowercase version of a string
def end_other(a, b):
    lA=len(a)
    lB=len(b)
    if lA>lB:
        return a.lower()[-lB:]==b.lower()
    elif lB>lA:
        return b.lower()[-lA:]==a.lower()
    return a.lower()==b.lower()