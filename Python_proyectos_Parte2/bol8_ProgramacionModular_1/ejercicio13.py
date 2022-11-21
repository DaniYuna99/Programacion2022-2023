'''
Created on Nov 11, 2022

@author: estudiante
'''

'''13. Escribe una función que, dada una lista de 
nombres y una letra, devuelva una lista con todos 
los nombres que empiezan por dicha letra. 
Debe validar los datos.'''

''' *********************************** '''        
''' ************ FUNCIONES ************ '''    
''' *********************************** '''  

''' Función buscarEnListaConLetra(lista, letra) '''
def buscarEnListaConLetra(lista, letra) :
    
    listaConElementosQueridos = []
    
    
    for palabra in (lista) :
        
        if (palabra[0] == letra) :
            listaConElementosQueridos.append(palabra)
    
    
    return listaConElementosQueridos
    
    
    
''' *********************************** '''        
''' ************* MAINAPP ************* '''
''' *********************************** '''

# LISTA (CAMBIAR SI NECESARIO)
lista = ["tijeras", "Tonto", "KISAMAAAAAAAAA", "SUSGAYYYYYYYYYY"]

# INPUT DE VARIABLE letra. BUCLE WHILE COMPRUEBA SI ES UN CARACTER Y NO UN DÍGITO O UNA PALABRA
letra = input("Escribe una letra, y buscaré las palabras que empiecen por ella: ")

while (len(letra) != 1 or letra.isalpha() == False) :
    letra = input("MAL. Escribe una letra; no un número o más de un caracter: ")


print("*" * 40)

# IFs QUE MUESTRAN EL RESULTADO
if (len(buscarEnListaConLetra(lista, letra)) == 0) :
    print(f"En la lista no hay ninguna palabra que contenga la letra '{letra}'.")
    
else :
    print(f"Las palabras que contienen la letra {letra}: {buscarEnListaConLetra(lista, letra)}")








