'''
Created on 9 dic 2022

@author: Daniel
'''

from math import pi as PI   

'''
2. Defina una función que dado el radio de un círculo devuelva su longitud.
'''

''' *************************************************************************************** '''        
''' ************************************** FUNCIONES ************************************** '''    
''' *************************************************************************************** ''' 

''' ====================== Función calcularPerimetroCirculo (radio) ======================= '''
def calcularPerimetroCirculo (radio) :
    
    return (round(radio * 2 * PI, 2))



''' *************************************************************************************** '''        
''' *************************************** MAINAPP *************************************** '''    
''' *************************************************************************************** '''

assert(calcularPerimetroCirculo(4)) == 25.13
assert(calcularPerimetroCirculo(2)) == 12.57
assert(calcularPerimetroCirculo(15)) == 94.25
print("Test correctos.")