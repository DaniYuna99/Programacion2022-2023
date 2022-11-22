'''
Created on 5 nov 2022

@author: Daniel
'''

'''2. Realiza un programa que lea 10 números, 
los imprima separados por coma y a
continuación los desplace una posición (y 
los muestre por pantalla desplazados), de
tal forma que el último pase a la primera 
posición, el primero a la segunda, el
segundo a la tercera, y así sucesivamente.

    - Opcional: Añade un parámetro (D/I) a la función 
    para que el controle el sentido del desplazamiento 
    (a derechas/izquierdas) [HECHO]
    
    - Opcional 2: Añade otro que indique el número de posiciones
    a desplazar (0: quedaría igual, 1: desplaza una posición, etc.).'''


#Variable direccion
direccion = input("¿Hacia qué dirección quieres que se produzca el desplazamiento (D o I)? ").upper()

while (direccion not in ("D", "I")) :
    direccion = input("Izquierda (I) o derecha (D), mammoni: ").upper()


listaNumeros = []


# Bucle For, que se encarga de recoger los números via Input, 
# y los almacena en una lista
for i in range (10) :
    numeroInput = int(input("Escribe un número: "))
    listaNumeros.append(numeroInput)


listaConDesplazamientos = []


if (direccion == "D") :
    
    posicionActual = (len(listaNumeros) - 1)
    
    
    for j in range (10) :
        
        numeroADesplazar = listaNumeros[posicionActual]
        listaConDesplazamientos.append(numeroADesplazar)
        
        posicionActual += 1
        
        if ((posicionActual) >= (len(listaNumeros) - 1)) :
            posicionActual = 0

else :        
    
    posicionActual = 1 
    
    
    for j in range (10) :
        
        numeroADesplazar = listaNumeros[posicionActual]
        listaConDesplazamientos.append(numeroADesplazar)
        
        posicionActual += 1
        
        if ((posicionActual) >= len(listaNumeros)) :
            posicionActual = 0


print("*" * 40)           
print(listaConDesplazamientos)
    
    
    
    
    
    
    