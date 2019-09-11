#Given an array of ints, return True if the sequence of numbers 1,2,3 appears in the array somewhere.
def array123(nums):
    i=0
    s=[1,2,3]
    # while i!=len(nums):
    for i in range(len(nums)):

        if nums[i:i+3]==[1,2,3]:
            return True
        i+=1
    return False
    