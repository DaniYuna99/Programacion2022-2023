'''
Created on Nov 17, 2022

@author: estudiante
'''

'''7. Design a method called isPrime 
that receives one integer positive number 
greater than 0 as parameter. The method 
should return True if the number is prime 
or False if not prime. If the parameter 
is not valid the method should return None.'''


''' *********************************** '''        
''' ************ FUNCTIONS ************ '''    
''' *********************************** '''  

''' ===== Function isPrime (number) ===== '''
def isPrime (number) :
    
    if (number in [1,2]) :
        
        #Nota: no he jugado ningún Metroid en mi vida, pero es funny
        metroidPrime = True 
        
        
    elif (number > 2) :
        
        divisorsOfThatNumber = 0
        metroidPrime = True
        
        
        for divisor in (2, (number // 2)) :
            
            if (number % divisor == 0) :
                divisorsOfThatNumber += 1
        
        
        if (divisorsOfThatNumber > 0) :
            metroidPrime = False
            
            
    else :
        
        metroidPrime = None


    return (metroidPrime)



''' *********************************** '''        
''' ************* MAINAPP ************* '''
''' *********************************** '''

eleccion = "Y"


while (eleccion == "Y") :
    
    # Input de variable number, y dependiendo de si es positivo o cero o menor,
    # hay varios resultados
    number = int(input("Insert a number, and I will tell you if it's a prime number: "))
    
    
    # Ifs con los resultados, dependiendo si la función isPrime() devuelve True, 
    # False o None (si el valor de la variable number no es válido)
    if (isPrime(number) == True) :
        print(f"The number {number} is a prime number.")
    
    elif (isPrime(number) == False) :
        print(f"The number {number} is not a prime number.")
    
    else :
        print(f"The number {number} is not a valid number. Try again.")
    
    
    # Input de variable eleccion, que decide si continuar el bucle While o no
    eleccion = input("Do you want to know if more numbers are prime numbers? (Y/N): ").upper()
    
    while (eleccion != "Y" and eleccion != "N") :
        eleccion = input("Introduce Y or N to continue: ").upper()

    print("*" * 50)


print("You exited the program.")








