'''
Created on 25 sept 2022

@author: Daniel
'''

'''4. Realizar un programa que lea la 
edad de una persona menor a 100 años e
informe de si es un niño (0-12 años), 
un adolescente (13-17), un joven (18-29) 
o un adulto.'''

edad = int(input("Dime tu edad: "))


if (edad <= 100) :
    
    if (edad >= 0 and edad <= 12) :
        print("Eres un niño.")
    
    elif (edad >= 13 and edad <= 17) :
        print("Eres un adolescente.")
    
    elif (edad >= 18 and edad <= 29) :
        print("Eres un joven.")
    
    else :
        print("Eres un adulto.")

else :
    print("No se puede introducir una edad superior a 100.")