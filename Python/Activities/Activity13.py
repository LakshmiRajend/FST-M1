numbers= list(input("Enter numbers:").split(","))
def sum(nums):
    sumOfNum=0
    for n in nums:
        sumOfNum+=int(n)
    return sumOfNum
myList=sum(numbers)
print(myList)

