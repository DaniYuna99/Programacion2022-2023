'''
Created on 7 nov 2022

@author: Daniel
'''

'''3. Realiza un programa que solicite la fecha 
como tres datos numéricos (día, mes y año) y 
muestre a continuación la fecha en formato largo.

    Introduce el día de la fecha: 15
    Introduce el mes de a fecha: 3
    Introduce el año de a fecha: 2009
    La fecha en formato largo es 15 de Marzo de 2009
    
Debe validar los datos y ejecutarse hasta que se introduzca un día negativo.'''


''' *********************************** '''        
''' ************ FUNCIONES ************ '''    
''' *********************************** '''        

''' === Función esAnyoBisiesto() === '''
def esAnyoBisiesto (anyo) :
    
    esBisiesto = False
    
    if ((anyo % 4 == 0 and anyo % 100 != 0) or 
    (anyo % 4 == 0 and anyo % 100 == 0 and anyo % 400 == 0)) : 
        esBisiesto = True
    
    
    return esBisiesto

####################################################
####################################################

''' === Función pedirFecha() === '''
def pedirFecha ():
    
    print("*" * 40)
    
    
    # Variable dia
    dia = int(input("Día: "))
    
    while (dia == 0 or dia >= 32) :
        dia = int(input("Dato no válido. Introduce el día de nuevo: "))
        
        
    # Variable mes
    mes = int(input("Mes: "))
    
    while (mes <= 0 or mes >= 13) :
        mes = int(input("Dato no válido. Introduce el mes de nuevo: "))
    
    
    # Variable anyo
    anyo = int(input("Año: "))
    
    while (anyo <= 0) :
        anyo = int(input("Dato no válido. Introduce el año de nuevo: "))
    
    
    return dia, mes, anyo

####################################################
####################################################

''' === Función pedirFecha() === '''

def comprobarDias(dia, mes, anyo):
    
    esValido = True
    
    if ((dia > 28 and mes == 2 and esAnyoBisiesto(anyo) == False) 
        or (dia > 30 and (mes == 4 or mes == 6 or mes == 9 or mes == 11)) 
        or (dia > 31 and (mes == 1 or mes == 3 or mes == 5 or mes == 7 or 
            mes == 8 or mes == 10 or mes == 12))) :
        esValido = False
    
    
    return esValido
        

####################################################
####################################################


        
''' *********************************** '''        
''' ************* MAINAPP ************* '''
''' *********************************** '''  
      
dia, mes, anyo = pedirFecha()
    
    
# WHILE QUE COMPRUEBA SI LA VARIABLE dia APORTADA POR EL USUARIO ES CORRECTA
# PARA ELLO, SE USA LA FUNCIÓN comprobarDias(dia, mes, anyo)
while (comprobarDias(dia, mes, anyo) == False) :
    print("-" * 40)
    print("La fecha no es válida. Introdúcela de nuevo.")
    print("-" * 40)
    dia, mes, anyo = pedirFecha()


# ---- IFs QUE REDIRECCIONA EL PROGRAMA PARA SALIR DE ÉL, O PROSEGUIR ----
if (dia < 0) :
    
    cadenaConFecha = "Has salido del programa."


else :  
    
    listaNombreMeses = ["Enero", "Febrero", "Marzo", "Abril", 
                        "Mayo", "Junio", "Julio", "Agosto", 
                        "Septiembre", "Octubre", "Noviembre", "Diciembre"]
    
    cadenaConFecha = f"{dia} de {listaNombreMeses[mes - 1]} de {anyo}"


# ------ MUESTRA DEL RESULTADO ------
print("*" * 40)
print(cadenaConFecha) 


'''
Meses con 30 días: Abril, Junio, Septiembre y Noviembre.
Meses con 31 días: Enero, Marzo, Mayo, Julio, Agosto, Octubre y Diciembre.
Meses con 28 días: Febrero (Menos cuando es bisiesto que tiene 29 días).
'''    
    
    
    
    