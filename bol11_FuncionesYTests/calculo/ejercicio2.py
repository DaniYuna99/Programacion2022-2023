'''
Created on 5 dic 2022

@author: Daniel
'''

'''
2. Write a Python program to compute the greatest 
common divisor (GCD) of two positive integers.
'''

''' *************************************************************************************** '''        
''' ************************************** FUNCTIONS ************************************** '''    
''' *************************************************************************************** '''  

''' ========================= Function getDivisors (number) ======================== '''
def getDivisors (number) :
    
    listDivisors = [] 
    
    
    for i in range (1, (number + 1)) :
        
        if (number % i == 0) :
            listDivisors.append(i)
            
        
    return (listDivisors)


''' =============== Function greatestCommonDivisor (number1, number2) ============== '''
def greatestCommonDivisor (number1, number2) :
    
    GCD = 0
    
    n1Divisors = getDivisors(number1)
    n2Divisors = getDivisors(number2)
    
    
    for N1 in (n1Divisors) :
        
        for N2 in (n2Divisors) :
            
            if ((N1 == N2) and (N2 > GCD)) :
                GCD = N2
    
    
    return (GCD)



''' *************************************************************************************** '''        
''' *************************************** MAINAPP *************************************** '''    
''' *************************************************************************************** '''

assert(greatestCommonDivisor(12, 24)) == 12
assert(greatestCommonDivisor(32, 96)) == 32
assert(greatestCommonDivisor(3, 9)) == 12
print("Tests correctos.")









