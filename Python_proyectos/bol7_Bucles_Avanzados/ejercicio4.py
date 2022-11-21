'''
Created on 16 oct 2022

@author: Daniel
'''

'''4. Diseña un programa que reciba el tamaño de una secuencia numérica y muestre en
una única línea cada una de las siguientes secuencias. Si se recibe el número 6 se
imprimiría:

    a. 1, -5, 25, -125, 625, -3125
    b. 1, -1, 0, 1, -1, 0
    c. 1, 3, 9, 27, 81, 243'''

tamano = int(input("Dime un tamaño para la secuencia de números que viene después: "))

while (tamano <= 0) :
    tamano = int(input("Números negativos o 0 no se permiten: "))

numero = 1
resultadoA = "a. 1, "
resultadoB = "b. "
resultadoC = "c. 1, "


#Primera secuencia
for elemento in range (tamano - 1) :
    
    numero *= -5
    
    if (elemento < (tamano - 2)) :  
        resultadoA += str(numero) + ", "
    else :
        resultadoA += str(numero) + "."


numero = 1


#Segunda secuencia
for elemento in range (tamano) :
    
    if (elemento % 3 == 0) :
        numero = 1
    
    elif (elemento % 3 == 1) :
        numero = -1
    
    else :
        numero = 0
    
    
    if (elemento < (tamano - 1)) :  
        resultadoB += str(numero) + ", "
    else :
        resultadoB += str(numero) + "."


numero = 1


#Tercera secuencia
for elemento in range (tamano - 1) :
    
    numero *= 3
    
    if (elemento < (tamano - 2)) :  
        resultadoC += str(numero) + ", "
    else :
        resultadoC += str(numero) + "."


print(resultadoA)
print(resultadoB)
print(resultadoC)
    
    
    
    
    
    