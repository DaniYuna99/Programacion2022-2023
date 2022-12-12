'''
Created on 9 dic 2022

@author: Daniel
'''

'''
3. Función tal que dadas las coordenadas de dos puntos 
en el plano devuelve su distancia euclídea. Un punto 
en el plano tiene dos coordenadas (abscisa y ordenada), 
por lo tanto, la entrada a esta función son cuatro 
valores reales.
'''


''' *************************************************************************************** '''        
''' ************************************** FUNCIONES ************************************** '''    
''' *************************************************************************************** ''' 

''' ========================= Función extraerCoordenadas (cadena) ========================= '''
def extraerCoordenadas (cadena) :
    
    coordX = ""
    coordY = ""
    
    
    if ((cadena[0] in ["[","("]) and (cadena[-1] in ["]",")"])) :
        
        comaDetectada = False
        
        
        for caracter in (cadena) :
            
            if (caracter == ",") :
                comaDetectada = True 
                
            elif (((caracter.isdigit()) or (caracter in ["-", "."]) == True) and (comaDetectada == False)) :
                coordX += caracter
                
            elif (((caracter.isdigit() == True) or (caracter in ["-", "."]) == True) and (comaDetectada == True)) :
                coordY += caracter
    
    
        coordX = float(coordX)
        coordY = float(coordY)
    
    
    else :
        coordX = None 
        coordY = None
            
        
    return (coordX, coordY)



''' ============= Función calcularDistanciaEuclidea (coordenada1, coordenada2) ============ '''
def calcularDistanciaEuclidea (coordenada1, coordenada2) :
    
    X1, Y1 = extraerCoordenadas(coordenada1)
    X2, Y2 = extraerCoordenadas(coordenada2)
    
    distanciaX = X1 - X2 
    distanciaY = Y1 - Y2
    
    
    if (distanciaX < 0) :
        distanciaX = -(distanciaX)
    
    if (distanciaY < 0) :
        distanciaY = -(distanciaY)
    
    
    return (distanciaX, distanciaY)



''' *************************************************************************************** '''        
''' *************************************** MAINAPP *************************************** '''    
''' *************************************************************************************** '''

assert(calcularDistanciaEuclidea("[1, 1]", "[5, 7]")) == (4, 6)
assert(calcularDistanciaEuclidea("[6.5, 8]", "[2, 40]")) == (4.5, 32)
assert(calcularDistanciaEuclidea("[24, -3]", "[12, 56]")) == (12, 59)
print("Tests correctos.")






