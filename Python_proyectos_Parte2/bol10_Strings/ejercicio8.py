'''
Created on Nov 25, 2022

@author: estudiante
'''

'''8. Diseñar una función que determine la cantidad 
de vocales diferentes, que tiene una palabra
o frase introducida por teclado. Por ejemplo, la 
cadena “Abaco”, devolvería 2.'''


''' *********************************** '''        
''' ************ FUNCIONES ************ '''    
''' *********************************** '''  

''' ===== Función cantidadVocalesDiferentes (palabra) ===== '''
def cantidadVocalesDiferentes (palabra) :
    
    listaVocales = [["A", 0, "Á"], ["E", 0, "É"], ["I", 0, "Í"], ["O", 0, "Ó"], ["U", 0, "Ú"]]

    
    # Estos bucles For anidados registra las vocales encontradas en la frase. 
    # Si encuentra una, añade un +1 al segundo campo respectivo de las mini-listas, 
    # donde están las 5 vocales y su número de apariciones.
    for letra in (palabra) :
        
        for vocal in (listaVocales) :
            
            if ((letra.upper() == vocal[0]) or (letra.upper() == vocal[2])) :
                vocal[1] += 1
    
    
    # El siguiente bucle For rescata de la variable lista "listaVocales" las vocales encontradas. 
    # Para ello, inserta las mini-listas cuyo número de vocales encontradas es mayor que 0, y la inserta 
    # en la nueva variable "listaVocalesEncontradas"
    listaVocalesEncontradas = []
    
    
    for vocalConCuenta in (listaVocales) :
        
        if (vocalConCuenta[1] > 0) :
            listaVocalesEncontradas.append(vocalConCuenta)
    
    
    # El siguiente bucle While "construye" la variable "resultado", que es un String que muestra adecuadamente 
    # la cantidad de vocales encontradas y las mismas vocales también. Itera la variable "listaVocalesEncontradas", 
    # y utiliza de contador la variable "contadorListaVocales"
    resultado = f"La cantidad de vocales diferentes en '{palabra}' son {len(listaVocalesEncontradas)}, y son: " 
    
    contadorListaVocales = 0
    
    
    while (contadorListaVocales < len(listaVocalesEncontradas)) :
        
        resultado += listaVocalesEncontradas[contadorListaVocales][0]
        
        if (len(listaVocalesEncontradas) - 1 > contadorListaVocales) :
            resultado += ", "
        
        else :
            resultado += "."
            
            
        contadorListaVocales += 1
        
        
    return (resultado)



''' *********************************** '''        
''' ************* MAINAPP ************* '''
''' *********************************** ''' 

print(cantidadVocalesDiferentes("Abaco"))
print(cantidadVocalesDiferentes("murcielago"))
print(cantidadVocalesDiferentes("LIBÉLULA"))







