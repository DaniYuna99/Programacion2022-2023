'''
Created on Sep 27, 2022

@author: estudiante
'''

'''7. Realizar un algoritmos que lea un número y 
que muestre su raíz cuadrada y su raíz cúbica.
Python no tiene ninguna función predefinida que 
permita calcular la raíz cúbica, ¿cómo se
puede calcular?'''

num = int(input("Dime un número y calcularé su raíz cuadrada y su raíz cúbica: "))

print(f"La raíz cuadrada de {num} es {num ** 0.5}.")
print(f"La raíz cúbica de {num} es {(num ** 0.5) ** 0.5}.")