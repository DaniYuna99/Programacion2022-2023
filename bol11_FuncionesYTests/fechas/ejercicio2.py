'''
Created on Dec 12, 2022

@author: estudiante
'''

'''
2. Crea una función que devuelva la diferencia en segundos entre dos instantes de
tiempo del mismo día. Recibirá como parámetros seis valores, hora, minuto y
segundo de cada uno de los instantes.
'''


''' *********************************** '''        
''' ************ FUNCIONES ************ '''    
''' *********************************** '''


''' ===== Función devolverTiempoEnSegundos (horas, minutos, segundos) ===== '''
def devolverTiempoEnSegundos (horas, minutos, segundos) :
    
    segundosTotales = segundos
    
    
    if ((horas == 24 and minutos == 0 and segundos == 0) 
        or (horas < 24 and minutos < 60 and segundos < 60)) :
    
        yaEsta = False
        
        
        while (yaEsta == False) :
            
            if (horas >= 1) :
                horas -= 1
                segundosTotales += 3600 
                
            if (minutos >= 1) :
                minutos -= 1 
                segundosTotales += 60 
            
            if (horas == 0 and minutos == 0) :
                yaEsta = True
    
    
    else :
        segundosTotales = None
    
    
    return (segundosTotales)



''' ===== Función devolverDiferenciaEntreSegundos (horas1, minutos1, segundos1, horas2, minutos2, segundos2) ===== '''
def devolverDiferenciaEntreSegundos (segundosTotales1, segundosTotales2) :

    resultado = segundosTotales1 - segundosTotales2
    
    
    if (resultado < 0) :
        resultado = -(resultado)
        
        
    return (resultado)



''' *********************************** '''        
''' ************* MAINAPP ************* '''    
''' *********************************** '''

eleccion = "Y"


while (eleccion == "Y") :
    
    horas1 = int(input("Dime las horas de la primera hora: "))
    minutos1 = int(input("Dime los minutos de la primera hora: "))
    segundos1 = int(input("Dime los segundos de la primera hora: "))
    
    segundosTotales1 = devolverTiempoEnSegundos(horas1, minutos1, segundos1)
    
    
    print("-" * 50)
    
    horas2 = int(input("Dime las horas de la segunda hora: "))
    minutos2 = int(input("Dime los minutos de la segunda hora: "))
    segundos2 = int(input("Dime los segundos de la segunda hora: "))
    
    segundosTotales2 = devolverTiempoEnSegundos(horas2, minutos2, segundos2)
    
    
    if (segundosTotales1 != None or segundosTotales2 != None) :
        
        diferenciaSegundosEntreLosDos = devolverDiferenciaEntreSegundos(segundosTotales1, segundosTotales2)
    
     
        print("-" * 50)
        
        print(f"La diferencia en segundos entre {horas1}:{minutos1}:{segundos1} y {horas2}:{minutos2}:{segundos2} es de {diferenciaSegundosEntreLosDos} segundos.")
    
    
    
    else :
        
        print("Los parámetros introducidos son erróneos. Se ha devuelto el valor None.")
        
        
        
    print("\n")
    
    
    eleccion = input("¿Quieres repetir la operación con otros valores? (Y/N) ").upper()
    
    while (eleccion != "Y" and eleccion != "N") :
        eleccion = input("Error al elegir. Elige (Y/N): ").upper()
    
    
    print("\n")
    
    
    if (eleccion == "Y") :
        print("-" * 50)



print("*" * 50)
print("Has salido del programa.")






