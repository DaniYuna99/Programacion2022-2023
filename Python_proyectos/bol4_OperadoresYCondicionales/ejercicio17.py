'''
Created on Sep 29, 2022

@author: estudiante
'''

'''17. Escribir un programa que imprima todos los 
números pares entre dos números que se le
pidan al usuario.'''

num1 = int(input("Introduce un número: "))
num2 = int(input("Introduce otro número: "))
resultado = f"Los números pares entre {num1} y {num2} son: "


for i in range (num1 + 1, num2) :
    
    if (i % 2 == 0) :
        
        if (i == num2 or i + 1 == num2) :
            resultado = resultado + str(i) + "."
        else :
            resultado = resultado + str(i) + ", "


print(resultado)