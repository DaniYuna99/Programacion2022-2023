'''
Created on Nov 17, 2022

@author: estudiante
'''

'''5. Design a method called powerIt 
that receives two integers and raises 
the first number to the second. You may 
use the product or recursion and check 
the values. If no exponent is provided 
the first number is raised to 0.'''


''' *********************************** '''        
''' ************ FUNCTIONS ************ '''    
''' *********************************** '''  

''' ===== Function powerIt (int1, int2) ===== '''
def powerIt (int1, int2 = 0) :
    
    result = int1
    
    
    if (int2 == 0) :
        result = 1
    
    
    elif (int2 > 1) :
        
        contador = 1 
        
        
        while (contador < int2) :
            result *= int1
            contador += 1
            
            
    return (result)



''' *********************************** '''        
''' ************* MAINAPP ************* '''
''' *********************************** ''' 

assert powerIt(2,3) == 8
assert powerIt(2,4) != 8
assert powerIt(1,0) == 1
assert powerIt(1) == 1
print("Los Assert van bien.")











