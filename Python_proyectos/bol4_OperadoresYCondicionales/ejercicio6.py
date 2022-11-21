'''
Created on Sep 27, 2022

@author: estudiante
'''

'''6. Pide al usuario dos pares de números 
x1,y2 y x2,y2, que representen dos puntos en 
el plano. Calcula y muestra la distancia entre ellos.'''

''''
EJEMPLOS

1, 0
3, 1

Resultado: 2, 1


4, 2
-2, -3

Resultado: 6, 5
'''

x1 = int(input("Dime la coordenada x1: "))
y1 = int(input("Dime la coordenada y1: "))

x2 = int(input("Dime la coordenada x2: "))
y2 = int(input("Dime la coordenada y2: "))

distanciaX = (x1 - x2)
distanciaY = (y1 - y2)


if (distanciaX < 0) :
    distanciaX = -distanciaX

if (distanciaY < 0) :
    distanciaY = -distanciaY
    

print(f"La distancia entre los puntos {x1},{y1} y {x2},{y2} es de {distanciaX},{distanciaY}.")








