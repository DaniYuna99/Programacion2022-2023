'''
Created on 8 nov 2022

@author: Daniel
'''

'''6. Diseña una función llamada estaOrdenada 
que reciba una lista de elementos y devuelva 
True si está ordenada o False en caso contrario.'''


''' *********************************** '''        
''' ************ FUNCIONES ************ '''    
''' *********************************** ''' 

''' ===== Función estaOrdenadaAscendentemente(lista) ===== '''
def estaOrdenadaAscendentemente (lista) :
    
    if (len(lista) == 1) :
        ordenada = True 
    
    else :
        
        ordenada = False
        siguiente = 1
        yaEsta = False 
        
        for elemento in (lista) :
            
            if (elemento <= lista[siguiente] and yaEsta == False) :
                ordenada = True
            
            else :
                ordenada = False 
                yaEsta = True
            
            
            if (siguiente < len(lista) - 1) :
                siguiente += 1
    
    
    return ordenada


''' ===== Función estaOrdenadaDescendentemente(lista) ===== '''
def estaOrdenadaDescendentemente (lista) :
    
    if (len(lista) == 1) :
        ordenada = True 
    
    else :
        
        ordenada = False
        siguiente = 1
        yaEsta = False 
        
        for elemento in (lista) :
            
            if (elemento >= lista[siguiente] and yaEsta == False) :
                ordenada = True
            
            else :
                ordenada = False 
                yaEsta = True
            
            
            if (siguiente < len(lista) - 1) :
                siguiente += 1
    
    
    return ordenada



''' *********************************** '''        
''' ************* MAINAPP ************* '''
''' *********************************** '''

lista = []

eleccion = "Y"


while (eleccion != "N") :
    
    print("*" * 40)
    
    numeroInput = int(input("Dime un número, y lo guardaré en una lista: "))
    lista.append(numeroInput) 
    
    eleccion = input("¿Quieres seguir introduciendo números? (S/N): ").upper()
    
    while (eleccion != "N" and eleccion != "S") :
        eleccion = input("Pon S o N: ").upper()


print("*" * 40)
print(f"Lista creada: {lista}")


if (len(lista) == 1) :
    print("La lista creada sólo tiene un número, por lo que está ordenada ascendentemente y descendentemente simultáneamente.")
    
elif (estaOrdenadaAscendentemente(lista) == True) :
    print("La lista generada está ordenada ascendentemente.")

elif (estaOrdenadaDescendentemente(lista) == True) :
    print("La lista generada está ordenada descendentemente.")
    
else  :
    print("La lista generada no está ordenada ni ascendentemente ni descendentemente.")
      
      
      
      
    