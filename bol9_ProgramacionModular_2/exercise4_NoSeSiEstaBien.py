'''
Created on Nov 17, 2022

@author: estudiante
'''

'''4. Design a method called getDayOfWeek 
that receives a list containing three integers
(day, month and year) and returns the day of 
the week for that date (Monday, Tuesday, 
Wednesday, Thursday, Friday, Saturday, Sunday).
You can use the following algorithm to get a 
number between 0 (Sunday) and 6 (Saturday) 
corresponding to the day in the week for a 
given date:

    a = (14 - month) / 12
    y = year – a
    m = month + 12 * a – 2
    d = (day + y + (y / 4) - (y / 100) + (y / 400) + (31 * m) / 12) % 7'''
    

   
''' *********************************** '''        
''' ************ FUNCTIONS ************ '''    
''' *********************************** '''  

''' === Función esAnyoBisiesto() === '''
def esAnyoBisiesto (anyo) :
    
    esBisiesto = False
    
    if ((anyo % 4 == 0 and anyo % 100 != 0) or 
       (anyo % 4 == 0 and anyo % 100 == 0 and anyo % 400 == 0)) : 
        esBisiesto = True
    
    
    return (esBisiesto)



''' ===== Function getDayOfWeek (number) ===== '''
def getDayOfWeek (day, month, year) :
    
    a = ((14 - month) / 12)
    y = (year - a)
    m = (month + 12 * a - 2)
    
    d = ((day + y + (y / 4) - (y - 100) + (y / 400) + (31 * m) / 12) % 7)
    
    
    return int(d)



''' *********************************** '''        
''' ************* MAINAPP ************* '''
''' *********************************** '''

# Input de la variable "dia"
dia = int(input("Dime el día de la semana: "))

while (dia <= 0 or dia > 31) :
    dia = int(input("Error. Introduce un día entre 1 y 31: "))
    
    
# Input de la variable "mes". El bucle While garantiza que el año    
mes = int(input("Ahora, introduce el mes: "))

while (mes <= 0 or mes > 12 or (dia > 29 and mes == 2)) :
    mes = int(input("Error. Pon el mes bien: "))
     

# Input de variable "anyo", en la que se introduce el año de la fecha
# El bucle While garantiza que el valor insertado no es inferior de 1      
anyo = int(input("Pon el año: "))

while (anyo <= 0) :
    anyo = int(input("Negativos o cero no, gracias: "))
     

while (dia == 29 and mes == 2 and esAnyoBisiesto(anyo) == False) :
    anyo = int(input("Pon un año bisiesto si quieres que el día esté bien: "))
    
    
# Lista "listaDiasSemana", que contiene Strings con los nombres de los días de la semana, para 
# insertarlo en un print() con el resultado
listaDiasSemana = ["Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"]     

print("*" * 50)
print(f"El día {dia}-{mes}-{anyo} es un {listaDiasSemana[getDayOfWeek(dia, mes, anyo)]}.")




















