#Given an array of ints, return True if one of the first 4 elements in the arrya is a 9. The array length may be less than 4.
def array_front9(nums):
    if 9 in nums:
        if len(nums)<=4:
            return True
        else:
            for i in range(4):
                if nums[i]==9:
                    return True
            return False
    else:
        return False