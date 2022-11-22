'''
Created on Nov 4, 2022

@author: estudiante
'''

from random import randint

'''1. Crea un programa que genere 100 números de forma 
aleatoria y que posteriormente ofrezca al usuario la 
posibilidad de:

    a. Conocer el mayor
    b. Conocer el menor
    c. Obtener la suma de todos los números
    d. Obtener la media
    e. Sustituir el valor de un elemento por otro número introducido por teclado
    f. Mostrar todos los números

- Realiza cada una de las opciones con funciones.
- Utiliza la función siguiente para generar números 
  aleatorios (entre 0 y 1000).
  
  
  Funcion para generar numeros aleatorios: 
  
  from random import randint 
  numero = randint (0,1000)'''
  

''' ------------------------------ '''
''' --------- FUNCIONES ---------- '''
''' ------------------------------ '''

def menu () :
    print("*************************************************************************************")
    print("    a. Conocer el mayor")
    print("    b. Conocer el menor")
    print("    c. Obtener la suma de todos los números")
    print("    d. Obtener la media")
    print("    e. Sustituir el valor de un elemento por otro número introducido por teclado")
    print("    f. Mostrar todos los números")
    print("    g. Salir del programa")
    print("*************************************************************************************")
  

def conocerMayor (lista) :
    
    numeroMayor = lista[0]
    
    for numeroLista in (lista) :
        
        if (numeroMayor < numeroLista) :
            numeroMayor = numeroLista
            
            
    print(f"El número más grande de la lista es {numeroMayor}.")
    
     

def conocerMenor (lista) :
    
    numeroMenor = lista[0]
    
    for numeroLista in (lista) :
        
        if (numeroMenor > numeroLista) :
            numeroMenor = numeroLista
            
    
    print(f"El número más pequeño de la lista es {numeroMenor}.")


def sumaNumeros (lista) :
    
    sumaTotal = 0
    
    for numeroLista in (lista) :
        sumaTotal += numeroLista 
        
    
    return sumaTotal


def mediaNumeros (lista) : 
    
    sumaTotal = sumaNumeros(lista)
    
    
    print(f"La media de los números de la lista da {(sumaTotal / 100)}.")
    
    
def sustituirElemento (lista) :
    
    elementoAEncontrar = int(input("Dime el valor del número que quieres sustituir. Se sustituiran todos lo que tengan el mismo: "))
    elementoSustituto = int(input("Introduce el valor nuevo: "))
    
    indiceActual = 0
    haySustitucion = False
    
    
    for numeroLista in (lista) :
        
        if (numeroLista == elementoAEncontrar) :
            lista[indiceActual] = elementoSustituto
            haySustitucion = True
        
        indiceActual += 1
    
    
    if (haySustitucion == True) :
        print("Sustitución completada.")
    
    else :
        print("No se ha encontrado ningún elemento, por lo que no ha habido sustitución.")
           

        
''' ------------------------------ '''
''' ----------- MAINAPP ---------- '''
''' ------------------------------ '''   
 
print("PROGRAMA QUE GENERA NÚMEROS 100 ALEATORIOS.")
print("*" * 30)

#CREACION DE LISTA DE NÚMEROS ALEATORIOS
listaNumerosRandom = []

for i in range (100) :
    numero = randint(0, 1000)
    listaNumerosRandom.append(numero)
    

  
print("Lista creada. ¿Qué quieres hacer con ella?\n ")
print(f"{listaNumerosRandom}\n")
menu()


#PEDIDA DE ELECCION, Y SE COMPRUEBA SI EL DATO INTRODUCIDO NO FIGURA EN LAS LETRAS ESPERADAS
eleccion = input("Elige una opción: ").upper()
    
while (eleccion != "A" and eleccion != "B" and eleccion != "C"
       and eleccion != "D" and eleccion != "E" and eleccion != "F" and eleccion != "G") :
    eleccion = input("Elige BIEN: ").upper()



#ELECCIONES A PARTIR DE AQUÍ + WHILE PARA PEDIR DE NUEVO ELECCIONES
while (eleccion != "G") :
    
    print("*" * 30)
    
        
    if (eleccion == "A") :
        conocerMayor(listaNumerosRandom)
    
    elif (eleccion == "B") :
        conocerMenor(listaNumerosRandom)
    
    elif (eleccion == "C") :
        print(f"La suma total de los números de la lista da: {sumaNumeros(listaNumerosRandom)}")
    
    elif (eleccion == "D") :
        mediaNumeros(listaNumerosRandom)
    
    elif (eleccion == "E") :
        sustituirElemento(listaNumerosRandom)
    
    elif (eleccion == "F") :
        print(listaNumerosRandom)
    
    
    print("\n")
    menu()
    
    eleccion = input("Elige una opción: ").upper()
    
    while (eleccion != "A" and eleccion != "B" and eleccion != "C"
           and eleccion != "D" and eleccion != "E" and eleccion != "F" and eleccion != "G") :
        eleccion = input("Elige BIEN: ").upper()
    

print("Saliste del programa. Adiós.")   
    
    
    
    
    
    
    
    
    
    
    
    
    
    

