'''
Created on Nov 17, 2022

@author: estudiante
'''

'''10. Design a method called isFriendNumber 
that receives two positive numbers and
returns True if the numbers are friends, 
False otherwise. Two numbers are
considered to be friends if the sum of its 
divisors, except the given number, is equal
to the second and vice versa.'''


''' *********************************** '''        
''' ************ FUNCTIONS ************ '''    
''' *********************************** '''  

''' ===== Function "getDivisorsOfNumber (number)" ===== '''
def getDivisorsOfNumber (number) :
    
    sumDivisors = 0 
    
    
    for possibleDivisor in range (1, number) :
        
        if (number % possibleDivisor == 0) :
            sumDivisors += possibleDivisor 
            
    
    return (sumDivisors) 



''' ===== Function "isFriendNumber (num1, num2)" ===== '''
def isFriendNumber (num1, num2) :
    
    return (getDivisorsOfNumber(num1) == num2 
        and getDivisorsOfNumber(num2) == num1)



''' *********************************** '''        
''' ************* MAINAPP ************* '''
''' *********************************** '''
    
# NOTA: 220 y 284; 1184 y 1210; 2620 y 2924 son números amigos

print("FRIEND NUMBERS DETECTOR")
print("*" * 50)

number1 = int(input("Tell me a number: "))
number2 = int(input("Tell me a second number: "))

print("*" * 50)


if (isFriendNumber(number1, number2) == True) :
    print(f"{number1} and {number2} are friend numbers.")
    
else :
    print(f"{number1} and {number2} are NOT friend numbers.") 






