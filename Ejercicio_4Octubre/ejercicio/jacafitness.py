'''
Created on Oct 4, 2022

@author: estudiante
'''

'''En el gimnasio Jacafitness tienen el siguiente horario: 
Los Lunes, Miércoles y Viernes imparten Spinning de 12 a 14, 
Yoga de 16 a 20 y Body Combat de 20 a 22; Los Martes y 
Jueves la sesión de Spinning y Yoga se intercambian.

Elabora un programa que dé la bienvenida al gimnasio 
Jacafitness y tras preguntar por la hora y el día de 
la semana te indique la actividad que puedes realizar.
'''

dia = str(input("¿Cuál es el día de la semana? (L, M, X, J, V): "))
dia = dia.upper()
hora = int(input("¿A qué hora entras al gimnasio? "))

print("*" * 30)


if (((dia == "L" or dia == "X" or dia == "V") and (hora >= 12 and hora <= 14)) 
     or ((dia == "M" or dia == "J") and (hora >= 16 and hora < 20))) :
    print("En este momento, se está impartiendo la clase de Spinning.")
    
elif (((dia == "L" or dia == "X" or dia == "V") and (hora >= 16 and hora < 20)) 
     or ((dia == "M" or dia == "J") and (hora >= 12 and hora <= 14))) :
    print("En este momento, se está impartiendo la clase de Yoga.")

elif (hora >= 20 and hora <= 22) :
    print("En este momento, se está impartiendo la clase de Body Combat.")

elif (dia == "S" or dia == "D") or ((hora >= 0 and hora <= 11) or (hora >= 21 and hora <= 24)) :
    print("El gimnasio está cerrado.")

elif (hora == 15) :
    print("El gimnasio está abierto, pero ahora mismo no se imparte ninguna clase. Vuelve dentro de una hora.")

else :
    print("Te has equivocado introduciendo el día y/o la hora.")



