'''
Created on 5 dic 2022

@author: Daniel
'''

'''
3. Write a Python program to get the least 
common multiple (LCM) of two positive
integers.
'''

''' *************************************************************************************** '''        
''' ************************************** FUNCTIONS ************************************** '''    
''' *************************************************************************************** '''  

''' =========================== Function isPrimeNumber (number) =========================== '''
def isPrimeNumber (number) :
    
    divisors = 0 
    
    
    for i in range (1, (number + 1)) :
        
        if (number % i == 0) :
            divisors += 1 
    
    
    return (divisors == 2)



''' ========================== Function decomposeNumber (number) ========================== '''
def decomposeNumber (number) :
    
    listDecomposedNumber = []
    
    
    while (number > 1) :
        
        alreadyDivided = False
        
        
        for possibleDivisor in range (2, (number + 1)) :
            
            if ((isPrimeNumber(possibleDivisor) == True) and (number % possibleDivisor == 0)
                    and (alreadyDivided == False)) :
                listDecomposedNumber.append(possibleDivisor)
                number = number // possibleDivisor
                alreadyDivided = True
    
    
    return (listDecomposedNumber)


    
''' ================= Function leastCommonMultiple (number1, number2) ================ '''
def leastCommonMultiple (number1, number2) :

    N1_Multiples = decomposeNumber(number1)
    N2_Multiples = decomposeNumber(number2)
    
    LCM = N1_Multiples[0]
    
    
    for N1 in (N1_Multiples) :
        
        for N2 in (N2_Multiples) :
            
            if (N1 == N2 and LCM > N1) :
                LCM = N1
    
    
    return (LCM)



''' *************************************************************************************** '''        
''' *************************************** MAINAPP *************************************** '''    
''' *************************************************************************************** '''

assert(leastCommonMultiple(5, 25)) == 5
assert(leastCommonMultiple(12, 108)) == 2
assert(leastCommonMultiple(200, 400)) == 2
print("Tests correctos.")

