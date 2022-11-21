'''
Created on Nov 11, 2022

@author: estudiante
'''

'''9. Desarrolla un programa que a partir de 
una lista de números y un entero k, realice la
llamada a tres funciones: 

    a) para devolver una lista de números con los menores de k, 
    b) otra con los mayores
    c) otra con aquellos que son múltiplos de k.'''
    
def listaConNumerosMenoresQueK (lista, k) :
    
    listaNumMenores = []
    
    
    for numeroLista in (lista) :
        
        if (numeroLista < k) :
            listaNumMenores.append(numeroLista)
        
    
    return listaNumMenores


def listaConNumerosMayoresQueK (lista, k) :
    
    listaNumMayores = []
    
    
    for numeroLista in (lista) :
        
        if (numeroLista > k) :
            listaNumMayores.append(numeroLista)
        
    
    return listaNumMayores
    

def listaConMultiplosDeK (lista, k):
    
    listaMultiplos = [] 
    
    
    for numeroLista in (lista) :
        
        if (numeroLista % k == 0) :
            listaMultiplos.append(numeroLista)
        
    
    return listaMultiplos
    

def menu (lista) : 
    print("\n*********************************************************")
    print("                        MENÚ\n")
    print(f"     LISTA: {lista}\n")
    print("    a) Lista de números con los menores de k\n"
          + "    b) Lista con aquellos números mayores que el número k\n"
          + "    c) Lista con aquellos números múltiplos del número k\n"
          + "    d) Salir\n")
    print("*********************************************************")



''' ======== MAINAPP ======== '''

# LISTA DE NÚMEROS CREADA POR MÍ MISMO PARA TENER UNA BASE PARA COMPARAR
listaNumeros = [119, 67, -32, 9, 490, -905, 1, 222]

# INPUT DE LA VARIABLE k (VALE CUALQUIER NÚMERO NEGATIVO O POSITIVO)
k = int(input("Dime el valor del número k: "))

# DESPLIEGUE DEL MENU CON LA FUNCIÓN DEDICADA A ELLO, menu()
menu(listaNumeros)

# VARIABLE eleccion
eleccion = input("¿Qué es lo que quieres que muestre? ").lower()

while (eleccion != "a" and eleccion != "b" and eleccion != "c" and eleccion != "d") :
    eleccion = input("Error. Elige bien: ").lower()


# ------ IFs CON LAS OPCIONES, METIDAS EN UN BUCLE WHILE PARA PEDIRLAS DE NUEVO -----
while (eleccion != "d") :
    
    print("\n" + ("-" * 57))
    
    # IFs CON LAS OPCIONES
    if (eleccion == "a") :
        
        if (len(listaConNumerosMenoresQueK(listaNumeros, k)) == 0) :
            print(f"No hay números menores que {k}.")
            
        else :
            print(f"Lista con números menores que {k}:\n") 
            print(f"{listaConNumerosMenoresQueK(listaNumeros, k)}")
    
    
    elif (eleccion == "b") :
        
        if (len(listaConNumerosMayoresQueK(listaNumeros, k)) == 0) :
            print(f"No hay números mayores que {k}.")
        
        else :
            print(f"Lista con números mayores que {k}:\n")
            print(f"{listaConNumerosMayoresQueK(listaNumeros, k)}")
    
    
    else :
        
        if (len(listaConMultiplosDeK(listaNumeros, k)) == 0) :
            print(f"No hay múltiplos de {k}.")
        
        else :
            print(f"Lista de números múltiplos de {k}:\n")
            print(f"{listaConMultiplosDeK(listaNumeros, k)}")
      
       
    print("-" * 57)
    
    # DESPLIEGUE DEL MENU CON LA FUNCIÓN DEDICADA A ELLO, menu()
    menu(listaNumeros)
    
    # INPUT DE VARIABLE eleccion, PARA SALIR O NO DEL BUCLE WHILE 
    eleccion = input("¿Qué es lo que quieres que muestre? ").lower()

    while (eleccion != "a" and eleccion != "b" and eleccion != "c" and eleccion != "d") :
        eleccion = input("Error. Elige bien: ").lower()
 
    
print("\n" + ("*" * 57))
print("Saliste del programa.")








