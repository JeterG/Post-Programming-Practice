#Given 2 strings, a and b, return the number of positions where they contain the same length 2 substring. So "xxcaazz" yields 3, since  the "xx","aa" and "az" substrings appear in the same place in both strings.
def string_match(a, b):
    count=0
    for i in range(max(len(a),len(b))):
        if a[i:i+2]==b[i:i+2]:
            if len(a[i:i+2])==2 and len(b[i:i+2])==2:
                count+=1
    return count