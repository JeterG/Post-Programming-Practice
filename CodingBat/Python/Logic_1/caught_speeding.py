#You are driving a little too fast, and a police officer stops you. Write code to compute hte result, encoded as an int value: 0 = no ticket, 1 = small ticket, 2 = big ticket. If speed is 60 or less, the result is 0. If speed between 61 and 80 inclusive, the result is 1. if speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
def caught_speeding(speed,is_birthday):
    s=speed
    if is_birthday:
        s-=5
    if s<=60:
        return 0
    elif 61<=s<=80:
        return 1
    return 2