'''
Created on 25 sept 2022

@author: Daniel
'''

'''2. Realizar un programa que solicite dos 
números por teclado e imprima en pantalla si 
son iguales, el primero mayor que el segundo 
o el primero más pequeño que el segundo.'''

num1 = int(input("Dime el primer número: "))
num2 = int(input("Dime el segundo número: "))


if (num1 == num2) :
    print(f"Ambos números son iguales.")

elif (num1 > num2) :
    print(f"{num1} es mayor que {num2}.")

else :
    print(f"{num1} es menor que {num2}.")