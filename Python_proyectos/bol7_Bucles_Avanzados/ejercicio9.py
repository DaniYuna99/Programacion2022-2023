'''
Created on Oct 24, 2022

@author: estudiante
'''

'''9. Crea un programa nuevo basado en el anterior 
que genere las mismas figuras, pero vacías:'''


#Variable con un menú    
MENU = "EJERCICIO 9 (FIGURAS HUECAS)\n¿Qué forma quieres generar?\na. Cuadrados \nb. Triángulos \nc. Rombos\n"
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

#CUADRADO
if (respuesta.upper() == "A") :
    
    j = 1
    
    while (j <= tamano) :
        
        if ((j == 1) or (j == tamano)) :
            print("* " * tamano)
            
        else :
            print("*" + ((tamano * 2 - 3) * " ") + "*")
            
        j += 1
 
    
#TRIANGULO    
elif (respuesta.upper() == "B") :
    
    numEspacios = 1
    
    for j in range (tamano) :
        
        if (j == 0) :
            print((" " * tamano) + "*")
            
        else :
            print(((tamano - j) * " ") + ("*" + (" " * (numEspacios)) + "*"))
            numEspacios += 2
    
    print("* " * (tamano + 1))
       
        
#ROMBO        
elif (respuesta.upper() == "C") :
        
    numEspacios = 1 
    
    print((" " * (tamano + 1)) + "*")
    
    
    for elemento in range (tamano - 1) :
        print(((tamano - elemento) * " ") + ("*" + (" " * numEspacios) + "*"))
        numEspacios += 2
        
        
    numEspacios -= 2
    
    
    for j in range (tamano - 1, 0, -1) :
        
        numEspacios -= 2
        
        if (j == 1) :
            print((" " * (tamano + 1)) + "*")
        
        else :
            print(((tamano - j + 2) * " ") + ("*" + (" " * numEspacios) + "*"))
    
    
    



