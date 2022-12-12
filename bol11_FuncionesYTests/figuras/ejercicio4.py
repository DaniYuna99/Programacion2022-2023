'''
Created on 9 dic 2022

@author: Daniel
'''

'''
4. Función tal que dadas las coordenadas de un triángulo en el plano, nos devuelve
su perímetro.
'''


''' *************************************************************************************** '''        
''' ************************************** FUNCIONES ************************************** '''    
''' *************************************************************************************** ''' 

''' ========================= Función extraerCoordenadas (cadena) ========================= '''
                                    #Sacada del ejercicio 3
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



''' ============== Función calcularDistanciaEuclidea (coordenada1, coordenada2) =========== '''
                                #Sacada del ejercicio 3
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



''' =========== Función calcularLineaEntreDosPuntos (coordenada1, coordenada2) =========== '''
def calcularLineaEntreDosPuntos (coordenada1, coordenada2) :

    x1, y1 = extraerCoordenadas(coordenada1)
    x2, y2 = extraerCoordenadas(coordenada2)
    
    linea = ((x2 - x1) ** 2) + ((y2 - y1) ** 2)
    linea = (linea ** 0.5)
    
    
    return (linea)



''' ======================= Función calcularPerimetroTriangulo (radio) ======================== '''
def calcularPerimetroTriangulo (coordenada1, coordenada2, coordenada3) :
    
    lado1 = calcularLineaEntreDosPuntos(coordenada1, coordenada2)
    lado2 = calcularLineaEntreDosPuntos(coordenada2, coordenada3)
    lado3 = calcularLineaEntreDosPuntos(coordenada3, coordenada1)
    
    
    return (lado1 + lado2 + lado3)


    
''' ======================= Función calcularAreaTriangulo (radio) ======================== '''
def calcularAreaTriangulo (coordenada1, coordenada2, coordenada3) :
    
    lado1 = calcularLineaEntreDosPuntos(coordenada1, coordenada2)
    lado2 = calcularLineaEntreDosPuntos(coordenada2, coordenada3)
    
    altura = ((lado1 ** 2) + ((lado2 / 2) ** 2)) ** 0.5
    
    resultado = (lado2 * altura) / 2
    
    
    return (resultado)




''' ======================= Función calcularAreaTriangulo (radio) ======================== '''
def calcularAreaTriangulo2 (lado1, lado2) :
    
    altura = ((lado1 ** 2) + ((lado2 / 2) ** 2)) ** 0.5
    
    resultado = (lado2 * altura) / 2
    
    
    return (resultado)
    
    

''' *************************************************************************************** '''        
''' *************************************** MAINAPP *************************************** '''    
''' *************************************************************************************** '''

print(calcularAreaTriangulo("[1,1]", "[3,3]", "[5,5]"))
print(calcularAreaTriangulo2(8, 8))





