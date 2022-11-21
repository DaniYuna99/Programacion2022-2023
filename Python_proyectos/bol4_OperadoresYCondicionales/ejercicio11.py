'''
Created on 27 sept 2022

@author: Daniel
'''

'''11. Escribir un programa que lea un año indicar 
si es bisiesto. Nota: un año es bisiesto si es un
número divisible por 4, pero no si es divisible 
por 100, excepto que también sea divisible
por 400.'''

anyo = int(input("Dime un año y te diré si es bisiesto o no: "))


if (anyo % 4 != 0) : 
    print("No es bisiesto")
    
elif (anyo % 4 == 0 and anyo % 100 != 0) : 
    print("Es bisiesto")
    
elif (anyo % 4 == 0 and anyo % 100 == 0 and anyo % 400 != 0) : 
    print("No es bisiesto")
    
elif (anyo % 4 == 0 and anyo % 100 == 0 and anyo % 400 == 0) : 
    print("Es bisiesto")