'''
Created on 27 sept 2022

@author: Daniel
'''

'''13. El director de una escuela está organizando un 
viaje de estudios, y requiere determinar cuánto debe 
cobrar a cada alumno y cuánto debe pagar a la compañía 
de viajes por el servicio. La forma de cobrar es la 
siguiente: si son 100 alumnos o más, el costo por cada
alumno es de 65 euros; de 50 a 99 alumnos, el costo 
es de 70 euros, de 30 a 49, de 95 euros, y si son 
menos de 30, el costo de la renta del autobús es de 
4000 euros, sin importar el número de alumnos. 
Realice un algoritmo que permita determinar el pago 
a la compañía de autobuses y lo que debe pagar 
cada alumno por el viaje.'''

alumnos = int(input("¿Cuántos alumnos van en la excursión? "))


if (alumnos >= 100) :
    print("Cada alumno tiene que pagar 65 euros cada uno.")

elif (alumnos < 100 and alumnos >= 50) :
    print("Cada alumno tiene que pagar 70 euros cada uno.")

elif (alumnos < 50 and alumnos >= 30) :
    print("Cada alumno tiene que pagar 95 euros cada uno.")

else :
    print(f"Cada alumno tiene que pagar {4000 / alumnos} euros cada uno.")
    
    
    