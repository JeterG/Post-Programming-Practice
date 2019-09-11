#Given an array of ints, return the number of 9's in the array.
def array_count9(nums):
    if (9 in nums)==False:
        return 0
    else:
        count=0
        for i in nums:
            if i==9:
                count+=1
        return count