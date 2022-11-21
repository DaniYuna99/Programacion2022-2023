'''
Created on Oct 10, 2022

@author: estudiante
'''

'''2. Escribe una aplicación que pida la fecha actual (día y mes) 
y el hemisferio (Norte/Sur) e indique en qué estación se encuentra:

    a. Hemisferio Norte: Otoño (desde 23 Septiembre), Invierno (desde 21
    diciembre), Primavera (desde 21 Marzo), Verano (desde 21 Junio).
    b. Hemisferio Sur: Primavera (desde 23 Septiembre), Verano (desde 21
    diciembre), Otoño (desde 21 Marzo), Invierno (desde 21 Junio).'''

dia = int(input("Introduce el día del mes: "))
mes = int(input("Ahora, introduce el mes: "))
hemisferio = str(input("Introduce el hemisferio donde resides (Norte (N) o Sur (S)): ")).upper()


if ((dia < 0) or (dia > 31) or (mes <= 0) or (mes > 12) or (mes == 2 and dia > 30)
    or (hemisferio != "N" and hemisferio != "S")) :
    print("Te has equivocado al introducir uno o varios datos.")

elif ((hemisferio == "N" and (mes == 9 and (dia >= 23 and dia <= 30)
    or (mes == 10) or (mes == 11) or (mes == 12 and (dia >= 1 and dia <= 20))))
    or (hemisferio == "S" and (mes == 3 and (dia >= 21 and dia <= 31)
    or (mes == 4) or (mes == 5) or (mes == 6 and (dia >= 1 and dia <= 20))))) :
    print("Otoño.")

elif ((hemisferio == "N" and (mes == 12 and (dia >= 21 and dia <= 31)
    or (mes == 1) or (mes == 2) or (mes == 3 and (dia >= 1 and dia <= 20))))
    or (hemisferio == "S" and (mes == 6 and (dia >= 21 and dia <= 30)
    or (mes == 7) or (mes == 8) or (mes == 9 and (dia >= 1 and dia <= 22))))) :
    print("Invierno.")

elif ((hemisferio == "N" and (mes == 3 and (dia >= 21 and dia <= 31)
    or (mes == 4) or (mes == 5) or (mes == 6 and (dia >= 1 and dia <= 20))))
    or (hemisferio == "S" and (mes == 9 and (dia >= 21 and dia <= 30)
    or (mes == 10) or (mes == 11) or (mes == 12 and (dia >= 1 and dia <= 20))))) :
    print("Primavera.")
    
else :
    print("Verano.")
                 
    