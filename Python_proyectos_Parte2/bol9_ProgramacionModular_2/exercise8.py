'''
Created on Nov 17, 2022

@author: estudiante
'''

'''8. Design a method called solveSecondOrderEquation 
that receives three integer positive numbers 
corresponding to the coefficients of a second order 
equation (ax2+bx+c=0) and computes its possible 
solutions. If the parameters are not valid the
method should return None.'''


''' *********************************** '''        
''' ************ FUNCTIONS ************ '''    
''' *********************************** '''  

''' ===== Function solveSecondOrderEquation (a, b, c) ===== '''
def solveSecondOrderEquation (a, b, c) :
    
    firstSolution = (b * b) - (4 * a * c)
    firstSolution = firstSolution ** 0.5
    
    if (firstSolution > 0) :
        firstSolution = -b + firstSolution
        firstSolution = firstSolution // (2 * a)
    
    else :
        firstSolution = None
    
    
    secondSolution = (b * b) - (4 * a * c)
    secondSolution = secondSolution ** 0.5
    
    if (secondSolution > 0) :
        secondSolution = -b - secondSolution
        secondSolution = secondSolution // (2 * a)
    
    else :
        secondSolution = None
    

    return (firstSolution, secondSolution)



''' *********************************** '''        
''' ************* MAINAPP ************* '''
''' *********************************** ''' 

print(solveSecondOrderEquation(1, 3, 2)) # -1, -2
print(solveSecondOrderEquation(2, -7, 3)) # 3, 0.5 [Más o menos da]
print(solveSecondOrderEquation(1, -2, 1)) 
# Debería dar 1, pero es un número complejo 
# con única sol., por lo que devuelve None

print(solveSecondOrderEquation(1, 3, -4)) # 1, -4
print(solveSecondOrderEquation(1, -7, -18)) # 9, -2





