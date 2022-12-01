'''
Created on Nov 17, 2022

@author: estudiante
'''

'''1. Design a method called computeFactorial that 
receives a positive integer and returns the factorial 
for that number. If the number is negative the 
method should return None.'''


''' *********************************** '''        
''' ************ FUNCTIONS ************ '''    
''' *********************************** '''  

''' ===== Function computeFactorial (number) ===== '''
def computeFactorial (number) :
    
    counter = 1
    factorial = number
    
    
    if (number in [0,1]) :
        
        factorial = 1
        
        
    elif (number >= 2) :
        
        while (counter < number) :
            
            factorial *= counter
            counter += 1


    else :
        
        factorial = None


    return factorial



''' *********************************** '''        
''' ************* MAINAPP ************* '''
''' *********************************** ''' 

number = int(input("Introduce a number to calculate its factorial. If the number is negative, it will return None: "))

print(f"The factorial of {number} is: {computeFactorial(number)}")







