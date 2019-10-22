#Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value, ignore just one copy, andl ikewise for the largest value. Use int division ot produce the final average. You may assume that the array is length 3 or more.
def centered_average(nums):
    nums.sort()
    nums[0]=0
    nums[-1]=0
    avg=0
    tot=0
    for num in nums:
        tot+=num
    avg=tot/(len(nums)-2)
    return avg
# print(centered_average([-10, -4, -2, -4, -2, 0]))    