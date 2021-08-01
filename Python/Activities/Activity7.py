numbers = list(input("Enter comma separated numbers: ").split(","))
sum = 0

for number in numbers:
  sum += int(number)

print(sum)