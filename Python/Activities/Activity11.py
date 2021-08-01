fruits_dictionary={
    "apple" : 12,
    "banana" : 10,
    "mango": 15
}
print(fruits_dictionary)
check=input("Enter fruit to be checked:")
for fruit in fruits_dictionary:
    if(fruit==check):
        print("Fruit is available in the dictionary")
        break
else:
    print("Fruit is not available")