'''
Created on 25 sept 2022

@author: Daniel
'''

'''1. Realizar un programa que lea un número entero 
por teclado e informe de si el número es par o impar 
(el cero se considera par).'''

numero = int(input("Dime un número: "))


if (numero % 2 == 0) :
    print(f"El número {numero} es par.")

else :
    print(f"El número {numero} es impar.")