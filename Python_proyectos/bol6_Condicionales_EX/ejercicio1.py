'''
Created on Oct 10, 2022

@author: estudiante
'''

'''1. Escribe el código de un programa que reciba un número de nota de 0 a 100 y nos
informe de las calificaciones en el siguiente formato:

    - 90-100, Sobresaliente
    - 70-89, Notable
    - 60-69, Bien
    - 50-59, Suficiente
    - 0-49, Suspenso'''

nota = int(input("Introduce una nota, y te diŕe tu calificación: "))
calificacion = ""


if (nota >= 90 and nota <= 100) :
    calificacion = "Sobresaliente."

elif (nota >= 70 and nota <= 89) :
    calificacion = "Notable."

elif (nota >= 60 and nota <= 69) :
    calificacion = "Bien."

elif (nota >= 50 and nota <= 59) :
    calificacion = "Suficiente."
    
elif (nota >= 0 and nota <= 49) :
    calificacion = "Suspenso."

else : 
    calificacion = "La nota no es válida; el número introducido es negativo o es superior a 100."


print("*" * 30)
print(calificacion)



