'''
Created on Sep 29, 2022

@author: estudiante
'''

'''19. Escribe un programa que dados dos números, 
uno real (base) y un entero positivo (exponente), 
saque por pantalla el resultado de la potencia. 
No se puede utilizar el operador de potencia.'''

base = int(input("Base: "))
expo = int(input("Exponente (positivo): "))
total = base


for i in range (1, expo) :
    total = total * base


print(f"El resultado de la potencia es: {total}")

