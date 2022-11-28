'''
Created on Nov 25, 2022

@author: estudiante
'''

'''. Crear una función que, tomando una cadena 
de texto como entrada, construya y devuelva
otra cadena formada de la siguiente manera: el 
método debe colocar todas las consonantes
al principio y todas las vocales al final de 
la misma, eliminando los blancos.
Por ejemplo, pasándole la cadena "curso de 
programacion", una posible solución sería
"crsdprgrmcnuoeoaaio'''


''' *********************************** '''        
''' ************ FUNCIONES ************ '''    
''' *********************************** '''  

''' ===== Función separarConsonantesYVocales (palabra) ===== '''
def separarConsonantesYVocales (palabra) :
    
    palabra = palabra.replace(" ", "")
    consonantes = ""
    vocales = "" 
    
    
    for letra1 in (palabra) :
        
        if (letra1.lower() in ["b", "c", "d", "f", "g", 
            "h", "j", "k", "l", "m", "n", "ñ", "p", "q", 
            "r", "s", "t", "v", "w", "x", "y", "z"]) :
            consonantes += letra1 
    
    
    for letra2 in (palabra) :
        
        if (letra2.lower() in ["a", "e", "i", "o", "u", 
                               "á", "é", "í", "ó", "ú"]) :
            vocales += letra2
    
    
    return (consonantes + vocales)



''' *********************************** '''        
''' ************* MAINAPP ************* '''
''' *********************************** ''' 

print(separarConsonantesYVocales("curso de programacion"))
print(separarConsonantesYVocales("playas y costas y coles"))
print(separarConsonantesYVocales("tienes que dejar de juzgar las cosas basándote en suposiciones culturales de mente estrecha, Nick"))











