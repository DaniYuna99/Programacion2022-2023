'''
Created on 8 nov 2022

@author: Daniel
'''

'''8. Realiza un programa que añada 
números enteros a una lista hasta que se
introduzca un número negativo. Haciendo 
uso de esta lista, elabora funciones que
devuelvan:

    a. una lista con todos los que sean primos.
    b. el sumatorio
    c. el promedio de los valores.
    d. una lista con el factorial de cada uno de esos números.'''

''' ===================================== '''

# Funciones apartado A

def detectarPrimo (numero) :
    
    divisores = 0 
    esPrimo = False
    
    for i in range (1, (numero + 1)) :
        if (numero % i == 0) :
            divisores += 1
        
    if (divisores == 2) :
        esPrimo = True 
    
    
    return esPrimo
        
        
    
def listaPrimos (lista) :
    
    numPrimos = []
    
    for numeroLista in (lista) :
        if (detectarPrimo(numeroLista) == True) :
            numPrimos.append(numeroLista)
    
    
    return numPrimos


''' ===================================== '''

# Funciones apartado B

def hacerSumatorio (numero) :
    
    sumatorio = 0 
    
    for i in range (1, (numero + 1)) :
        sumatorio += i 
        
    
    return sumatorio 


def sumarSumatoriosDeUnaLista (lista) :
    
    sumaTotal = 0
    
    for numeroLista in (lista) :
        sumaTotal += hacerSumatorio(numeroLista)
        
    
    return sumaTotal


''' ===================================== '''

# Funciones apartado C

def promedioDeValores (lista) :
    
    promedio = 0 
    
    
    for numeroLista in (lista) :
        promedio += numeroLista
    
    
    return (promedio / (len(lista)))
    
''' ===================================== '''

# Funciones apartado D

def hacerFactorial (numero) :
    
    factorial = 1 
    
    for i in range (1, (numero + 1)) :
        factorial *= i 
        
    
    return factorial 


def factorialesDeUnaLista (lista) :
    
    listaFactoriales = []
    
    for numeroLista in (lista) :
        listaFactoriales.append(hacerFactorial(numeroLista))
    
    
    return listaFactoriales
        
        
''' ===================================== '''
# Menu

def menu () :
    
    print("\n******************************************************************")
    print("    a. Una lista con todos los que sean primos\n" 
          + "    b. El sumatorio\n" 
          + "    c. El promedio de los valores\n"
          + "    d. Una lista con el factorial de cada uno de esos números\n"
          + "    e. Salir")
    print("******************************************************************")
    
''' ===================================== '''


listaNumeros = []
numeroInput = 1


while (numeroInput >= 0) :
    
    numeroInput = int(input("Introduce un número (Si quieres salir, pon uno negativo): "))
    
    if (numeroInput >= 0) :
        listaNumeros.append(numeroInput)
        
        
if (len(listaNumeros) >= 1) :
    
    menu()
    
    eleccion = input("Elige: ").upper()
    
    while (eleccion != "A" and eleccion != "B" and eleccion != "C" and eleccion != "D" and eleccion != "E") :
        eleccion = input("Error. Elige bien: ").upper()
        
    
    while (eleccion != "E") :
        
        print("-" * 60)
        
        
        if (eleccion == "A") :
            
            if (len(listaPrimos(listaNumeros)) == 0) :
                print("No hay ningún número primo en la lista creada.")
            
            else :
                print(f"Los números primos de la lista creada son: {listaPrimos(listaNumeros)}")
            
            
        elif (eleccion == "B") :
            print(f"La suma de los sumatorios de los números de la lista son: {sumarSumatoriosDeUnaLista(listaNumeros)}")
            
            
        elif (eleccion == "C") :
            print(f"El promedio de todos los números de la lista creada es: {promedioDeValores(listaNumeros)}")
             
             
        elif (eleccion == "D") :
            print(f"Los factoriales de los números de la lista son: {factorialesDeUnaLista(listaNumeros)}")
            
        
        print("-" * 60)
            
        menu()
    
        eleccion = input("Elige: ").upper()
        
        while (eleccion != "A" and eleccion != "B" and eleccion != "C" and eleccion != "D" and eleccion != "E") :
            eleccion = input("Error. Elige bien: ").upper()
    
    
print("*" * 40)
print("Has salido del programa.")
        




















