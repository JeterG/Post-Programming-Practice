#Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
def first_half(str):
    x=len(str)/2
    return str[:x]