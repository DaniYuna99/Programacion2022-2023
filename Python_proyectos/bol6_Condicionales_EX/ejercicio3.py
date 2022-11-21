'''
Created on 10 oct 2022

@author: Daniel
'''

'''3. Crea un programa que dada una fecha en formato (dd-mm-yyyy), 
nos devuelva cuántos días han transcurrido desde el 1 de enero de 
ese mismo año (considera que puede tratarse de un año bisiesto).'''


''' ************* FUNCIONES *************'''    

def esAnyoBisiesto (anyo) :
    
    esBisiesto = False
    
    if ((anyo % 4 == 0 and anyo % 100 != 0) or 
    (anyo % 4 == 0 and anyo % 100 == 0 and anyo % 400 == 0)) : 
        esBisiesto = True
    
    
    return esBisiesto
    
    
    
''' ************* MAINAPP *************'''    

fecha = str(input("Introduce una fecha con este formato (dd-mm-yyyy): "))
listaDias = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

print("*" * 30)


if (len(fecha) != 10) :
    print("La fecha introducida no está en el formato correcto.")

else :
    
    #If que le suma 1 día a Febrero si el año es bisiesto, usando la función esAnyoBisiesto de arriba
    if (esAnyoBisiesto(int(str(fecha[6] + fecha[7] + fecha[8] + fecha[9]))) == True) :
        listaDias[1] += 1

    dias = int(str(fecha[0] + fecha[1]))
    mes = int(str(fecha[3] + fecha[4]))
    totalDias = 0
    
    
    if ((dias == 0) or (dias > listaDias[mes - 1]) 
        or (mes == 0) or (mes > 12)) :
        
        print("Los días o meses no son válidos. Introdúcelo de nuevo.")
    
    
    else :
        
        for i in range (0, (mes - 1)) :
            totalDias += listaDias[i]
        
        totalDias += (dias - 1)
        
        print(f"Entre el 1 de Enero hasta {fecha} de ese mismo año, hay una diferencia de {totalDias} día(s).")    
        
    
    
    
    
    
    
    
    
    
    
    
    
    
