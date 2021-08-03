numbers= tuple(input("Enter numbers for tuple").split(","))
for n in numbers:
    if int(n)%5==0:
        print(n)