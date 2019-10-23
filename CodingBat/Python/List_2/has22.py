#Given an array of ints, return True if the array contains a 2 next to a 2 somewhere
def has22(nums):
    temp=0
    for num in nums:
        if temp==2 and num==2:
            return True
        else:
            temp=num
    return False