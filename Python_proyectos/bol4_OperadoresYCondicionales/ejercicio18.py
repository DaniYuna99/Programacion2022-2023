'''
Created on Sep 29, 2022

@author: estudiante
'''

'''18. Escribe un programa que pida el limite inferior 
y superior de un intervalo. Si el límite
inferior es mayor que el superior lo tiene que volver 
a pedir. A continuación se van introduciendo números 
hasta que introduzcamos el 0. Cuando termine
el programa dará las siguientes informaciones:

◦ La suma de los números que están dentro del intervalo (intervalo abierto).
◦ Cuantos números están fuera del intervalo.
◦ Informa si hemos introducido algún número igual a los límites del intervalo.'''


limInferior = int(input("Dime el límite inferior: "))
limSuperior = int(input("Dime el límite superior: "))


while (limInferior >= limSuperior) :
    print("Límites impuestos imposibles. Repita de nuevo.")
    limInferior = int(input("Dime el límite inferior: "))
    limSuperior = int(input("Dime el límite superior: "))

num = 1
numFuera = ""
numDentro = 0
numIgual = False


while (num != 0) : 
    
    num = int(input(f"Inserta un número entre {limInferior} y {limSuperior} (Para salir, introduce 0): "))
    
    if ((num == limInferior) or (num == limSuperior)) :
        numIgual = True 
            
    elif (num >= limSuperior or num <= limInferior) and (num != 0) :
        numFuera = numFuera + str(num) + " "
    
    else :
        numDentro = numDentro + num
    

print("------------------")
print(f"La suma de los números que están dentro del intervalo es: {numDentro}")
print(f"Los números fuera del intervalo son: {numFuera}")


if (numIgual == True) :
    print("Se ha introducido un número que equivale a uno de los límites del intervalo.")

else :
    print("No se ha introducido un número que equivale a uno de los límites del intervalo.")
    
    
    
    
    
    
    