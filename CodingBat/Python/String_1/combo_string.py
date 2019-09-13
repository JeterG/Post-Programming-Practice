#Given 2 strings, a and b, return a string of hte form short+long+short, with the shorter string on the outside and hte longer string on the inside. The strings will not be the same length, but they may be empty (length 0).
def combo_string(a, b):
    if len(a)>len(b):
        return b+a+b
    return a+b+a