'''
Created on Nov 8, 2022

@author: estudiante
'''

'''4. Crea un programa que lea por teclado 
números de forma sucesiva y los guarde en
una lista; el proceso de lectura y guardado 
finalizará cuando metamos un número negativo. 
En ese momento se mostrará el elemento mayor 
y los números pares.'''

listaNumeros = [] 

numeroInput = 1 
numeroMayor = -1
numerosPares = []


while (numeroInput >= 0) :
    
    numeroInput = int(input("Introduce un número: "))
    
    if (numeroMayor < numeroInput) :
        numeroMayor = numeroInput
    
    
    if (numeroInput % 2 == 0 and numeroInput >= 0) :
        numerosPares.append(numeroInput)
        
        
    if (numeroInput >= 0) :
        listaNumeros.append(numeroInput)
    
    
       
print("*" * 40)
print(f"- La lista creada: {listaNumeros}")
print(f"- De esa lista, el número más grande es: {numeroMayor}")
print(f"- Los números pares introducidos han sido: {numerosPares}")










