'''
Created on 18 oct 2022

@author: Daniel
'''

'''8. Escribe un programa que pregunte por el tipo 
de figura que quiere pintar y el tamaño del lado de 
la figura y genere las figuras correspondientes en 
el siguiente formato (los valores 3, 4 y 5 son de 
ejemplo, podrían pedirse desde 1 hasta 10).

    a. Cuadrados:
    b. Triángulos 
    c. Rombos'''


#Variable con un menú    
MENU = "EJERCICIO 8 (FIGURAS LLENAS)\n¿Qué forma quieres generar?\na. Cuadrados \nb. Triángulos \nc. Rombos\n"
print(MENU)


#Respuesta para elegir figura
respuesta = str(input("Elige: "))

while (respuesta.upper() != "A" and respuesta.upper() != "B" 
       and respuesta.upper() != "C") :
    respuesta = str(input("Te equivocaste al elegir. Elige bien: "))

    
#Tamaño de la figura    
tamano = int(input("¿De qué tamaño quieres generarlo? "))

while (tamano <= 0) :
    tamano = int(input("Ceros ni números negativos no permitidos porque ocurre nada entonces: "))


print("*" * 30)
linea = ""


#Ifs de las opciones y sus comportamientos
if (respuesta.upper() == "A") :
    
    j = 1
    
    while (j <= tamano) :
        print("* " * tamano)
        j += 1
    
    
elif (respuesta.upper() == "B") :
    
    asteriscos = 1
    
    for j in range (tamano) :
        print(((tamano - j) * "  ") + ("* " * asteriscos))
        asteriscos += 2
        
        
elif (respuesta.upper() == "C") :
        
    asteriscos = 1 
    
    for elemento in range (tamano) :
        print(((tamano - elemento) * " ") + ("*" * asteriscos))
        asteriscos += 2
        
        
    asteriscos -= 2
    
    for j in range (tamano, 0, -1) :
        asteriscos -= 2
        print(((tamano - j + 2) * " ") + ("*" * asteriscos))
        
        
        
        
        
        
        
        