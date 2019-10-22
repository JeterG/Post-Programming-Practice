#Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.
def sum13(nums):
    if len(nums)==0:
        return 0
    else:
        tot=0
        prev=0
        for num in nums:
            if num==13:
                prev=13
            elif prev==13:
                prev=num
            else:
                prev=num
                tot+=num
                
        return tot