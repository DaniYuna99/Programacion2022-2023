'''
Created on Nov 17, 2022

@author: estudiante
'''

'''2. Design a method called isLeapYear that receives 
a number and returns False for common years and True 
for leap years. You may know that a year is considered to
be a leap year if it is divisible by 4, unless it is 
also divisible by 100. A year is not a leap year if it 
is divisible by 100 unless it is also divisible by 400.'''


''' *********************************** '''        
''' ************ FUNCTIONS ************ '''    
''' *********************************** '''  

''' ===== Function isLeapYear (year) ===== '''
def isLeapYear (year) :
    
    isValidAndWholesomeOneHundredPupperinoUwU = False 
    
    if ((year % 4 == 0 and year != 100) or (year % 100 != 0 and year % 400 == 0)) :
        isValidAndWholesomeOneHundredPupperinoUwU = True 
        
        
    return isValidAndWholesomeOneHundredPupperinoUwU



''' *********************************** '''        
''' ************* MAINAPP ************* '''
''' *********************************** ''' 

year = int(input("Tell me a year, and I'll show you if it's a leap year or not: "))

while (year <= 0) :
    year = int(input("Negative numbers and zero are SO invalid and unwholesome one hundred. Positive numbers are not: "))


print("*" * 40)


if (isLeapYear(year) == True) :
    print(f"The year {year} is a leap year; February has 29 days.")
    
else :
    print(f"The year {year} is NOT a leap year; February has 28 days.")
    














