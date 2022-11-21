'''
Created on 25 sept 2022

@author: Daniel
'''

'''7. Realizar un programa que lea el estado 
civil de una persona (S-Soltero, C-Casado, 
V-Viudo y D-Divorciado) y su edad. Después 
debe mostrar por pantalla el porcentaje de 
retención que debe aplicársele de acuerdo con las
siguientes reglas:

    - A los solteros o divorciados menores 
      de 35 años, un 12%
    - Todas las personas mayores de 50 años, 
      un 8.5%
    - A los viudos o casados menores de 35 años, 
      un 11.3%
    - Al resto de casos se le aplica un 10.5%'''
    
edad = int(input("Dime la edad: "))
estadoCivil = str(input("Dime el estado civil (S, C, V, D): "))
estadoCivil = estadoCivil.upper()


if (edad <= 35 and (estadoCivil == "S" or estadoCivil == "D")) :
    print("Tienes un descuento de 12%.")

elif (edad >= 50) :
    print("Tienes un descuento de 8.5%.")
    
elif (edad <= 35 and (estadoCivil == "V" or estadoCivil == "C")) :
    print("Tienes un descuento de 11.3%.")

else :
    print("Tienes un descuento de 10.5%.")
    
    
    