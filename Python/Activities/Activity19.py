import pandas as pd
from pandas import ExcelWriter
data={
    "FirstName":["Satvik","Avinash","Lahri"],
    "LastName":["Shah","Kati","Rath"],
    "Email":["satshah@example.com","avinashk@example.com","lahri.rath@example.com"],
    "PhoneNumber":["4537829158","5892184058","4528727830"]
}
datafrm = pd.DataFrame(data)
print(datafrm)
writer=ExcelWriter('testEmployee.xlsx')
datafrm.to_excel(writer,'Sheet1',index=False)
writer.save