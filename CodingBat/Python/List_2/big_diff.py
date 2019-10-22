#Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array. Note: the built-in min(v1,v2) and max(v1,v2) functions return the smaller or larger of two values.
def big_diff(nums):
    small=10000000000000000
    big=0
    for num in nums:
        big=max(big,num)
        small=min(small,num)
    return big-small