'''
Created on Oct 17, 2022

@author: estudiante
'''

'''6. Juan recibe dos tipos de regalos de 
cumpleaños según el año en el que esté: si 
el año es para su familia le regala un puzzle; 
si es impar, recibe dinero. Cada nuevo cumpleaños 
recibe más regalos: así, cada año que recibe puzzles
obtiene el doble que el anterior; sin embargo, si 
se trata de dinero recibe 15€ más que en la anterior 
ocasión. Elabora un programa que calcule cuántos 
regalos ha recibido en total Juan, para una
edad determinada sabiendo que en el primer 
cumpleaños le regalaron un puzzle y en el segundo 20€.

    Ejemplo 1: 1 año ⇒ 1 puzzle
    Ejemplo: 2 años ⇒ 1 puzzle y 20€
    .....
    .....
    Ejemplo: 7 años ⇒ 15 puzzles y 105€'''


anyo = int(input("¿Qué años tiene Juan actualmente? "))
puzles = 0
dinero = 0
dineroAcumulado = 0
puzlesAcumulados = 0


for elemento in range (1, anyo + 1) :
    
    if (elemento % 2 == 1) :
        
        if (elemento == 1) :
            puzles = 1
            puzlesAcumulados = 1
        
        else : 
            puzles *= 2
            puzlesAcumulados += puzles
        
    
    else :
        
        if (elemento == 2) :
            dinero = 20 
            dineroAcumulado = 20
        
        else :
            dinero += 15
            dineroAcumulado += dinero
               
    
    print("\n\n")         
    print("*" * 30)
    print(f"Año {elemento}: ") 
    print("*" * 30)    
    print(f"Dinero total: {dineroAcumulado}")
    print(f"Puzles totales: {puzlesAcumulados}")  
        















