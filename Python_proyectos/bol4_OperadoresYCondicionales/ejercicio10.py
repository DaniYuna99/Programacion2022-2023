'''
Created on Sep 27, 2022

@author: estudiante
'''

'''10. Programa que lea 3 datos de entrada A, B y C. 
Estos corresponden a las dimensiones de los
lados de un triángulo. El programa debe determinar 
que tipo de triangulo es, teniendo en
cuenta los siguiente:

◦ Si se cumple Pitágoras entonces es triángulo rectángulo
◦ Si sólo dos lados del triángulo son iguales entonces es isósceles.
◦ Si los 3 lados son iguales entonces es equilátero.
◦ Si no se cumple ninguna de las condiciones anteriores, es escaleno.'''

a = float(input("Dime la longitud del lado A: "))
b = float(input("Dime la longitud del lado B: "))
c = float(input("Dime la longitud del lado C: "))


if (a == b and b == c and c == a) :
    print("El triángulo es equilátero.")

elif ((a ** 2) + (b ** 2) == (c ** 2)) :
    print("El triángulo es rectángulo.")
    
elif (a != b and b != c and c != a) :
    print("El triángulo es escaleno.")

else :
    print("El triángulo es isósceles.")

    
