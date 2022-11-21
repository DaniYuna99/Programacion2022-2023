'''
Created on Oct 14, 2022

@author: estudiante
'''

'''1. Crea un programa que tras preguntar por 
dos números realice la división del mayor
de ellos por el menor y muestre el resultado 
de la división, es decir, el cociente y el
resto. Solo puedes utilizar la suma o la resta, 
pero no otras operaciones.'''

num1 = int(input("Primer número: "))
num2 = int(input("Segundo número: "))

dividendo = 0
divisor = 0
cociente = 0
resto = 0

if (num1 <= num2) :
    dividendo = num2
    divisor = num1
else :
    dividendo = num1
    divisor = num2



if (dividendo % divisor == 0) :
    
    while (dividendo != 0) :
        dividendo -= divisor
        cociente += 1

else :
    
    while ((dividendo - divisor) > 0) :
        
        dividendo -= divisor
        cociente += 1
        resto = dividendo


print("*" * 30)
print(f"La división entre {num1} y {num2} da de cociente {cociente} y de resto {resto}.")





