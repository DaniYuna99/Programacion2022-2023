'''
Created on Sep 22, 2022

@author: estudiante
'''

'''
1. Escribir una expresión lógica que cumpla:

    a) Debe ser Verdadera si el contenido de las variables 
    enteras sueldo_bruto y sueldo_neto es
    el adecuado para una retención del 22%.
    
    b) Debe ser Verdadera si el contenido de la variable 
    entera día es un valor válido para el mes
    de mayo.
    
    c) Debe ser Verdadera si el número contenido en las 
    variables enteras num1 y num2 son
    múltiplos de tres.
    
    d) Debe ser Verdadera si la calificación contenida 
    en la variable real nota es un aprobado.
    
    e) Debe ser Verdadera si la media de la calificación 
    contenida en las variables reales nota1,
    nota2 y nota3 es un aproblado.
    
        NOTA: Además siempre debe ser Falsa en el caso contrario al que se formula.
'''

# --- a) ---
print("-----------")
print("APARTADO A")

#True
sueldoBruto = 200
sueldoNeto = 156
print(sueldoBruto * 0.78 == sueldoNeto)

#False
sueldoBruto = 200
sueldoNeto = 34
print(sueldoBruto * 0.78 == sueldoNeto)


# --- b) ---
print("-----------")
print("APARTADO B")

#True
mes = 5
print(mes == 5)

#False
mes = 7
print(mes == 5)


# --- c) ---
print("-----------")
print("APARTADO C")

#True
num1 = 3
num2 = 9
print(num1 % 3 == 0 and num2 % 3 == 0)

#False
num1 = 3
num2 = 5
print(num1 % 3 == 0 and num2 % 3 == 0)


# --- d) ---
print("-----------")
print("APARTADO D")

#True
calificacion = 6
print(calificacion >= 5)

#False
calificacion = 4
print(calificacion >= 5)


# --- e) ---
print("-----------")
print("APARTADO E")

#True
nota1 = 5
nota2 = 5
nota3 = 5
print((nota1 + nota2 + nota3) / 3 >= 5)

#False
nota1 = 3
nota2 = 6
nota3 = 2
print((nota1 + nota2 + nota3) / 3 >= 5)










