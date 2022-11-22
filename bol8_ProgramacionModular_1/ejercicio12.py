'''
Created on Nov 11, 2022

@author: estudiante
'''

'''12. Escribe una función unionListas que 
reciba dos listas y devuelva los elementos que
pertenecen a una, o bien, a la otra, pero sin 
repetir ninguno (unión de conjuntos).'''


''' *********************************** '''        
''' ************ FUNCIONES ************ '''    
''' *********************************** '''  

''' Función unionListas(lista1, lista2) '''
def unionListas (lista1, lista2) :
    
    listaElementosQueNoEstan = []
    
    
    for eleL1 in (lista1) :
        
        hayRepetido = False
        
        
        for eleL2 in (lista2) :
            
            if (eleL2 == eleL1) :
                hayRepetido = True
            
        
        if (hayRepetido == False) :
            listaElementosQueNoEstan.append(eleL1)
    
    
    return (lista2 + listaElementosQueNoEstan)



''' *********************************** '''        
''' ************* MAINAPP ************* '''
''' *********************************** '''

lista1 = [1,2,3,4,5] #Numeros usados: 1,2,3,4,5,6,7
lista2 = [2,6,7,1,4] #La unión son [2, 6, 7, 1, 4, 3, 5]


union = unionListas(lista1, lista2)
print(f"La unión de las dos listas aportadas: {union}")

union.sort()
print(f"La misma lista ordenada: {union}")




















