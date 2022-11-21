'''
Created on Sep 16, 2022

@author: estudiante
'''

''' 
---------- CONDICIONALES IF/ELIF y ELSE ---------- '''
'''

print("Hola mundo, he vuelto después de unos meses.")

nombre = str(input("Dime tu nombre: "))
edad = int(input("Dime tu edad: "))

print("Hola " + nombre + ".")


if (edad < 0) :
    print("No existe una persona con edad negativa.")
    
elif (edad < 18) : 
    print("Eres menor de edad.")
      
else :
    print("Eres mayor de edad.")
    
'''
    
   
''' 
---------- ARRAYS ---------- ''' 
'''    

nombres = ["Daniel", "Mariana", "Juan"]

print(nombres[1])


if (nombres[1] == "Mariana") :
    print("Buela, ¿qué tal?")
    
if (nombres[2] == "Juan") :
    nombres[2] = "Antonio"
    
    
print(nombres)

'''


''' 
---------- BUCLE FOR ---------- '''
'''

print("Voy a contar hasta 20 con un bucle For. Ahí va: ")

for i in range (1, 21) :
    print(i)
    
'''


''' 
---------- BUCLE WHILE ---------- '''
'''

print("Voy a contar hasta 20 con un bucle While. Ahí va: ")

numero = 1


while (numero < 21) :
    
    print(numero)
    
    if (numero == 15) :
        print("Number 15: Burger King Foot Lettuce.")
        
    numero = numero + 1

'''






