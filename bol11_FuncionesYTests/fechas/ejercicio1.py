'''
Created on Dec 12, 2022

@author: estudiante
'''

'''
1. Función que dado un instante (horas, minutos y segundos) 
devuelva el número de segundos transcurridos desde el inicio 
de un día hasta ese instante.
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



''' *********************************** '''        
''' ************* MAINAPP ************* '''    
''' *********************************** '''

eleccion = "Y"


while (eleccion == "Y") :
    
    print("-" * 50)
    
    horas = int(input("Dime las horas: "))
    minutos = int(input("Dime los minutos: "))
    segundos = int(input("Dime los segundos: "))
    
    
    if (horas < 12) :
        AM_o_PM = "AM"
    
    else :
        AM_o_PM = "PM"
    
    
    if (devolverTiempoEnSegundos(horas, minutos, segundos) != None) :
        print(f"La hora {horas}:{minutos}:{segundos} {AM_o_PM} son {devolverTiempoEnSegundos(horas, minutos, segundos)} segundos.")
    
    else :
        print("Los parámetros introducidos son erróneos. Se ha devuelto el valor None.")
        
        
    print("\n")
    
    
    eleccion = input("¿Quieres repetir la operación con otros valores? (Y/N) ").upper()
    
    while (eleccion != "Y" and eleccion != "N") :
        eleccion = input("Error al elegir. Elige (Y/N): ").upper()
    
    
    print("\n")



print("\n" + ("*" * 50))
print("Has salido del programa.")













