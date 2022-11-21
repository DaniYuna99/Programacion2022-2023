'''
Created on Sep 26, 2022

@author: estudiante
'''

'''10. Realizar un programa que lea un carácter 
y dos números enteros por teclado. Si el carácter 
leído es un operador aritmético, calcular la operación
correspondiente, si es cualquier otro debe mostrar un error.'''


caracter = str(input("Pon un caracter aquí. Si es un operador aritmético, haré una operación: "))
num1 = int(input("Ahora, dime un número: "))
num2 = int(input("Otro más: "))


if (caracter == "+") :
    print(f"La suma de los números da {num1 + num2}.")

elif (caracter == "-") :
    print(f"La resta de los números da {num1 - num2}.")
    
elif (caracter == "*" or caracter == "x" or caracter == "X") :
    print(f"La multiplicación de los números da {num1 * num2}.")

elif (caracter == "/") :
    print(f"La división de los números da {num1 / num2}.")

elif (caracter == "%") :
    print(f"El resto de los números da {num1 % num2}.")

else :
    print("Con el caracter introducido no se puede realizar una operación.")
    
    
    