numbers= list(input("Enter comma separated numbers:").split(","))
if numbers[0] == numbers[-1]:
    print(True)
else:
    print(False)