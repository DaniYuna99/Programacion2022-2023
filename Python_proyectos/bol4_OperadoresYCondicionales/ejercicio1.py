'''
Created on 26 sept 2022

@author: Daniel
'''

'''1. Dados los catetos de un triángulo rectángulo, 
calcular su hipotenusa.'''

cat1 = int(input("Primer cateto: "))
cat2 = int(input("Segundo cateto: "))

hipotenusa = (cat1 ** 2) + (cat2 ** 2)
hipotenusa = hipotenusa ** 0.5  #Una raíz cuadrada es un número elevado a 0.5

print(f"La hipotenusa del triángulo " + 
f"cuyos catetos miden {cat1} y {cat2} es {hipotenusa}.")