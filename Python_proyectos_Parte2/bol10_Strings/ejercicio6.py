'''
Created on Nov 25, 2022

@author: estudiante
'''

'''6. Realizar una función que busque una palabra 
escondida dentro de un texto. Por ejemplo, si
la cadena es “shybaoxlna” y la palabra que queremos 
buscar es “hola”, entonces si se encontrará y deberá 
devolver True, en caso contrario deberá devolver False.'''


''' *********************************** '''        
''' ************ FUNCIONES ************ '''    
''' *********************************** '''  

''' ===== Función buscarPalabraEscondida (frase, palabraABuscar) ===== '''
def buscarPalabraEscondida (frase, palabraABuscar) :
    
    indiceContador = 0
    palabraEncontrada = ""
    
    
    for letra in (frase) :
        
        if (letra == palabraABuscar[indiceContador]) :
            
            if (indiceContador < (len(palabraABuscar) - 1)) :
                indiceContador += 1
                
            palabraEncontrada += letra
        
    
    return (palabraABuscar == palabraEncontrada)



''' *********************************** '''        
''' ************* MAINAPP ************* '''
''' *********************************** ''' 

print(buscarPalabraEscondida("acdfaresgha", "casa"))
print(buscarPalabraEscondida("retbwerfaryjfracogar", "barro"))

