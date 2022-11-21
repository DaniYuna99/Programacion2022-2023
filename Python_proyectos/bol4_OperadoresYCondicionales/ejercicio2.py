'''
Created on Sep 27, 2022

@author: estudiante
'''

'''2. Escribir un programa que convierta un valor 
dado en grados Fahrenheit a grados Celsius.'''

#FORMULA : (GRADOS °F − 32) × 5 / 9

gFahrenheit = int(input("Introduce los grados Fahrenheit: "))

gCelsius = ((gFahrenheit - 32) * 5) / 9

print(f"{gFahrenheit} ºF es {gCelsius} ºC.")