'''
Created on 24 oct 2022

@author: Daniel
'''

'''10. Modifica el programa anterior para que 
en lugar de un asterisco podamos utilizar
cualquier otro caracter.'''


#Variable con un menú    
MENU = "EJERCICIO 10 (FIGURAS HUECAS CON EL CARACTER QUE QUIERAS)\n¿Qué forma quieres generar?\na. Cuadrados \nb. Triángulos \nc. Rombos\n"
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


#Introducción de caracter 
caracter = input("¿Qué caracter quieres usar para construir la figura? ")


print("*" * 30)
linea = ""


#Ifs de las opciones y sus comportamientos

#CUADRADO
if (respuesta.upper() == "A") :
    
    j = 1
    
    while (j <= tamano) :
        
        if ((j == 1) or (j == tamano)) :
            print((caracter + " ") * tamano)
            
        else :
            print(caracter + ((tamano * 2 - 3) * " ") + caracter)
            
        j += 1
 
    
#TRIANGULO    
elif (respuesta.upper() == "B") :
    
    numEspacios = 1
    
    for j in range (tamano) :
        
        if (j == 0) :
            print((" " * tamano) + caracter)
            
        else :
            print(((tamano - j) * " ") + (caracter + (" " * (numEspacios)) + caracter))
            numEspacios += 2
    
    print((caracter + " ") * (tamano + 1))
       
        
#ROMBO        
elif (respuesta.upper() == "C") :
        
    numEspacios = 1 
    
    print((" " * (tamano + 1)) + caracter)
    
    
    for elemento in range (tamano - 1) :
        print(((tamano - elemento) * " ") + (caracter + (" " * numEspacios) + caracter))
        numEspacios += 2
        
        
    numEspacios -= 2
    
    
    for j in range (tamano - 1, 0, -1) :
        
        numEspacios -= 2
        
        if (j == 1) :
            print((" " * (tamano + 1)) + caracter)
        
        else :
            print(((tamano - j + 2) * " ") + (caracter + (" " * numEspacios) + caracter))