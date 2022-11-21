'''
Created on Sep 29, 2022

@author: estudiante
'''

'''15. Realiza un programa que pida el día de la 
semana (del 1 al 7) y escriba el día correspondiente. 
Si introducimos otro número nos da un error.'''

diaSemana = int(input("Dime el día de la semana (en números del 1 al 7): "))


if (diaSemana == 1) :
    print("Es lunes.")

elif (diaSemana == 2) :
    print("Es martes.")
    
elif (diaSemana == 3) :
    print("Es miércoles.")

elif (diaSemana == 4) :
    print("Es jueves.")
    
elif (diaSemana == 5) :
    print("Es viernes.")

elif (diaSemana == 6) :
    print("Es sábado.")

elif (diaSemana == 7) :
    print("Es domingo.")

else : 
    print("Has puesto algo que no deberías. Prueba de nuevo.")