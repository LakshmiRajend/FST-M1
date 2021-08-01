import pandas as pd
from pandas.core.frame import DataFrame
emp=pd.read_excel('testFile.xlsx')
print(emp)
print("===================")
print("No of rows and columns is:",emp.shape)
print("===================")
print("Elements in column email:")
print(emp['Email'])
print("===================")
print("Sorted values in ascending order of first name:")
print(emp.sort_values('FirstName'))