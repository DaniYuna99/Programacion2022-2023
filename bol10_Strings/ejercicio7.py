'''
Created on Nov 25, 2022

@author: estudiante
'''

'''7. Diseñar una función que reciba como 
parámetro tres cadenas, la primera será una 
frase y deberá buscar si existe la palabra que 
recibe como segundo parámetro y reemplazarla 
por la tercera.'''


''' *********************************** '''        
''' ************ FUNCTIONS ************ '''    
''' *********************************** '''  

''' ===== Function reemplazarPalabraPorOtraEnUnaFrase (frase, palabraABuscar, palabraAReemplazar) ===== '''
def reemplazarPalabraPorOtraEnUnaFrase (frase, palabraABuscar, palabraAReemplazar) :
    
    indiceFrase = 0
    fraseConSustitucion = ""
    yaHaySustitucion = False
    longitudDePalabraBuscada = 0
    
    
    for letra in (frase) :
        
        if (palabraABuscar[0] == letra and longitudDePalabraBuscada == 0) :
            
            indiceActual = 1
            esLaPalabra = True
            
            
            while (indiceActual < (len(palabraABuscar) - 1)) :
                
                if (palabraABuscar[indiceActual] != frase[indiceFrase + indiceActual]) :
                    esLaPalabra = False
                    indiceActual = len(palabraABuscar) - 1
                
                elif (esLaPalabra == True) :
                    indiceActual += 1
                
            
            if (esLaPalabra == True) :
                fraseConSustitucion += palabraAReemplazar
                yaHaySustitucion = True
                longitudDePalabraBuscada = len(palabraABuscar)
            
            
        if (yaHaySustitucion == True and longitudDePalabraBuscada > 0) :
            longitudDePalabraBuscada -= 1
        
        else :
            fraseConSustitucion += letra
            indiceFrase += 1
        
    
    
    return (fraseConSustitucion)
    
    

''' *********************************** '''        
''' ************* MAINAPP ************* '''
''' *********************************** ''' 
                
print(reemplazarPalabraPorOtraEnUnaFrase ("holaquetal", "quetal", "comoestas"))
print(reemplazarPalabraPorOtraEnUnaFrase ("elcieloesazul", "cielo", "océano"))
print(reemplazarPalabraPorOtraEnUnaFrase ("verdeeslaesmeraldaesmeralda", "esmeralda", "hierba"))



