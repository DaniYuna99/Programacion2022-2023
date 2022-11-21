'''
Created on Oct 25, 2022

@author: estudiante
'''

'''11. Cuadrado de números:
Crea un programa que lea del teclado un número y 
genere un cuadrado con el patrón siguiente donde 
cada elemento está separado por un espacio.'''

#ESTÁ INCOMPLETO; NO SÉ CÓMO CONTINUARLO

tamano = int(input("Introduce el tamaño del cuadrado de números que quieres generar: "))
lineaString = ""

while (tamano <= 0) :
    tamano = int(input("Pon una cifra que no sea 0 o menor: "))


for elemento in range ((tamano * 2) - 1) :
    lineaString += str(tamano)
    
print(lineaString)


ceros = 1
contador = 0
limitador = 0

while (contador < tamano) :
    
    lineaInt = int(lineaString)

    for i in range (len(lineaString) - 2) :
        lineaInt -= int("1" + ("0" * ceros))
        lineaString = str(lineaInt)
        print(lineaString)
        
        ceros += 1
        limitador += 1
        contador += 1
        
        


'''
lista = []

for k in range (len(lineaString) - 1) :
    lista.append(int(lineaString[k]))
    
print(lista)


contador = 0


for j in range (tamano + 1) :
    
    if 
    lista[(contador) : (len(lineaString) - contador)] -= 1
    
    print(lista)
        
    contador += 1


lineaFinal = ""

for l in range (len(lista) - 1) :
    lineaFinal += str(lista[l])

print(lineaFinal)
'''

    