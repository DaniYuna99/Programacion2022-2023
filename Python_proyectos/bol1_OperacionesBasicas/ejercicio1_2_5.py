'''
Created on Sep 20, 2022

@author: estudiante
'''

'''1. Calcular el resultado de las siguientes expresiones
lógicas:
    a) 7 >= 27 AND NOT (7 <= 2)    
    b) 24 > 5 AND 10 <= 10 OR 10 == 5
    c) (10 >= 15 OR 23 == 13) AND NOT (8 == 8)
    d) NOT (6 / 3 > 3) OR 7 > 7'''
    
print("-------------")
print("Ejercicio 1") 

logica1 = 7 >= 27 and not (7 <= 2)
print (logica1)                                 # False    

print (24 > 5 and 10 <= 10 or 10 == 5)          # True
print ((10 >= 15 or 23 == 13) and not (8 == 8)) # False
print (not (6 / 3 > 3) or 7 > 7)                # True



'''2. Calcular el valor de las siguientes expresiones
aritméticas: 
    a) 27 mod 4 + 15/4
    b) 37/4²-2
    c) 9*2/3*10*3
    d) (7*3-4*4)²/4*2
    
    ORDEN DE PRIORIDAD DE OPERACIONES: 
        Paréntesis > Potencias > Division == Multiplicacion 
        (izq. a der.) > Suma == Resta (izq. a der.)'''
        
print("-------------")
print("Ejercicio 2")  
  
print((27 % 4) + (15 / 4))                  # 6.75
print((37 / (4**2)) - 2)                    # 0.3125
print(9 * 2 / 3 * 10 * 3)                   # 180
print((7 * 3 - 4 * 4)**2 /4 * 2)            # 12.5





    
'''5. Escribir la tabla de verdad para las siguientes 
expresiones lógicas:
    a) (A OR B) AND NOT(A)
    b) NOT (A OR B) AND B 
    c) A OR NOT (B)
    d) NOT ((A AND B) AND (B OR A))'''
    
# Están hechas las tablas en el cuaderno 
# de Programación.





    
    