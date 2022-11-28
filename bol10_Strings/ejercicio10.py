'''
Created on Nov 25, 2022

@author: estudiante
'''

'''10. Escribir una función que, devuelva el 
número de palabras que hay en una cadena que 
recibe como parámetro. Ten en cuenta que entre 
dos palabras puede haber más de un blanco.
También al principio y al final de la frase puede 
haber blancos redundantes. Por ejemplo, si la cadena 
es “He estudiado mucho”, debe devolver 3'''


''' *********************************** '''        
''' ************ FUNCIONES ************ '''    
''' *********************************** '''  

''' ===== Función devolverNumeroPalabrasEnFrase (frase) ===== '''
def devolverNumeroPalabrasEnFrase (frase) :
    
    numPalabras = 0
    empiezaLaNuevaPalabra = False
    indiceFrase = 0
    
    
    for letra in (frase) :
        
        if (letra.isalpha() or letra.isdigit() and empiezaLaNuevaPalabra == False) :
            empiezaLaNuevaPalabra = True
        
        if ((empiezaLaNuevaPalabra == True and letra == " ") or (indiceFrase == len(frase) - 2 and letra != " ")) :
            empiezaLaNuevaPalabra = False 
            numPalabras += 1
        
        indiceFrase += 1
        
        
    return (numPalabras)



''' *********************************** '''        
''' ************* MAINAPP ************* '''
''' *********************************** ''' 

print(devolverNumeroPalabrasEnFrase("tres tristes tigres comen trigo en un trigal")) #8
print(devolverNumeroPalabrasEnFrase("    Me     tiraba     por la    ventana, pero    no puedo    porque    hay barrotes. Confuncio   ")) #12