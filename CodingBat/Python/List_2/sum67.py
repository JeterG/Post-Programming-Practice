#Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.
def sum67(nums):
    sum=0
    temp=0
    for num in nums:
        if temp==6:
            if num == 7:
                temp=num
                continue 
        else:
            if num!=6:
                sum+=num
            temp=num
    return sum