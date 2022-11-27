'''
Created on Nov 17, 2022

@author: estudiante
'''

'''9. Design a method called getPrimeDivisors 
that receives a positive number as a
parameter and returns a list containing its 
prime divisors. If the parameter is not valid
the method should return None.'''


''' *********************************** '''        
''' ************ FUNCTIONS ************ '''    
''' *********************************** '''  

''' ===== Function isPrime (number) ===== '''
def isPrime (number) :
    
    isValidAndHeckingDoggo = False
    divisors = 0
    
    
    for numberino in range (2, number) :
            
        if (number % numberino == 0) :
            divisors += 1
                
        
    if (divisors == 0) :
        isValidAndHeckingDoggo = True
    
    
    return (isValidAndHeckingDoggo)
    


''' ===== Function getPrimeDivisors (number) ===== '''
def getPrimeDivisors (number) :
    
    if (number > 0) :
        
        listPrimeNumbers = []
        
        
        for possibleDivisor in range (1, (number + 1)) :
            
            if (number % possibleDivisor == 0 
                and isPrime(possibleDivisor) == True) :
                
                listPrimeNumbers.append(possibleDivisor)
    
    
    else :
        
        listPrimeNumbers = None
        
        
    return (listPrimeNumbers)



''' *********************************** '''        
''' ************* MAINAPP ************* '''
''' *********************************** ''' 

number = int(input("Input a positive number: "))


print("*" * 50)


if (getPrimeDivisors(number) == None) :
    print("It has returned 'None', so the number introduced is not valid.")

else :
    print(f"The divisors, which also are prime numbers of {number} are: {getPrimeDivisors(number)}")















