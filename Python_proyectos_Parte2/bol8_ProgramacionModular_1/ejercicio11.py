'''
Created on Nov 11, 2022

@author: estudiante
'''

'''11. Escribe una función intersect que 
reciba dos listas y devuelva otra lista 
con los elementos que son comunes a ambas, 
sin repetir ninguno.'''


''' *********************************** '''        
''' ************ FUNCIONES ************ '''    
''' *********************************** '''  

''' Función intersect(lista1, lista2) '''
def interseccion (lista1, lista2) :
    
    listaFinal = []
    
    
    for elementoL1 in (lista1) :
        
        for elementoL2 in (lista2) :
            
            if (elementoL1 == elementoL2) :
                listaFinal.append(elementoL1)
        
    
    return listaFinal



''' *********************************** '''        
''' ************* MAINAPP ************* '''
''' *********************************** '''

lista1 = [1,2,3,4,5]
lista2 = [6,7,2,4,8] #Los comunes son 2 y 4

print(interseccion(lista1, lista2))
      
      
      
lista1 = [102, 224, 3534, 4567, 50]
lista2 = [50, 7, 2, 3534, 102] #Los comunes son 50, 3534 y 102

print(interseccion(lista1, lista2))



lista1 = [102, 224, 3534, 4567, 50]
lista2 = [3456657, 7, 2, 3534000, 102234] #No hay comunes

print(interseccion(lista1, lista2))












