'''
Created on Oct 3, 2022

@author: estudiante
'''

'''Ejemplo de bucle For: Crea una tabla de multiplicar 
sin usar la multiplicación. 

    Pista: para ello, se requiere programar un bucle For
    y toquetear los crecimientos del contador.'''
    
numero = int(input("¿De cuál número quieres ver la tabla de multiplicar? "))
multiplicacion = 0

for i in range (0, ((numero * 10) + 1), numero) :
    
    print(f"{numero} x {multiplicacion} = {i}")
    multiplicacion = multiplicacion + 1