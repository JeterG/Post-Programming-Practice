#We want make a package of goal kilos of chocolate. We have small bars(1 kilo each) and big bars (5 kilos each). Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.
def make_chocolate(small, big, goal):
    if small + big*5<goal:
        return -1
    elif big*5+small==goal:
        return small
    elif goal%5==small:
        return small
    elif goal%5==0 and big*5>=goal:
        return 0
    elif goal-big*5<small and (goal-big*5)>0:
        return goal-big*5    
    elif goal%5<small:
        return goal%5   

    return -1
# print(make_chocolate(1000,1000000,5000006))
# print(make_chocolate(6,1,10))