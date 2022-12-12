'''
Created on 5 dic 2022

@author: Daniel
'''

'''
1. Write a Python program to calculate the sum of digits of a number.
'''

''' *************************************************************************************** '''        
''' ************************************** FUNCTIONS ************************************** '''    
''' *************************************************************************************** '''  

''' ========================= Function sumDigitsOfANumber (number) ======================== '''
def sumDigitsOfANumber (number) :
    
    total = 0
    numberStr = str(number)
    
    
    for digit in (numberStr) :
        total += int(digit)
        
        
    return (total)



''' *************************************************************************************** '''        
''' *************************************** MAINAPP *************************************** '''    
''' *************************************************************************************** '''

assert(sumDigitsOfANumber(123)) == 6
assert(sumDigitsOfANumber(123456789)) == 45
print("Tests correctos.")


print("-" * 50)

number = int(input("Introduce the number you want to sum its digits separately: "))

print(f"The sum of the digits of {number} is {sumDigitsOfANumber(number)}.")

