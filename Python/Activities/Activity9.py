list1= list(input("Enter numbers for List 1:").split(","))
list2= list(input("Enter numbers for List 2:").split(","))
list3=[]
for num in list1:
    if int(num)%2!=0:
     list3.append(num)
for val in list2:
    if int(val)%2==0:
        list3.append(val)
print(list3)
