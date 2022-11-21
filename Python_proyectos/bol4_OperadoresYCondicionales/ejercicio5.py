'''
Created on Sep 27, 2022

@author: estudiante
'''

'''5. Pide al usuario dos números y muestra la "distancia" 
entre ellos (el valor absoluto de su diferencia, de modo 
que el resultado sea siempre positivo).'''

num1 = int(input("Dime un número y te muestro la distancia que hay entre otro: "))
num2 = int(input("Dime el segundo número: "))

distancia = (num1 - num2)

if (distancia < 0) :
    distancia = -distancia

print(f"La distancia entre los números {num1} y {num2} es de {distancia} unidad/es.")