# 1000-digit Fibonacci number
numbers=[1,1]
def Fibonacci(n): 
    if (len(numbers)-1<n):
        numbers.append(numbers[n-1]+numbers[n-2])
        return numbers[n]
    return numbers[n]
def digits(n):
    count=0
    while(n>0):
        n=n//10
        count+=1
    return count
def thousand():
    index = 2
    digitsCounted =0
    while (digitsCounted!=1000):
        digitsCounted=digits(Fibonacci(index))
        index+=1
        print (digitsCounted , " at index " ,index)

    return index
print(thousand())  
# print (len(numbers))
# print(Fibonacci(0))
# print(Fibonacci(1))
# print(Fibonacci(2))
# print(Fibonacci(3))

