'''
Created on Sep 29, 2022

@author: estudiante
'''

'''16. Escribe un programa que pida un número entero 
entre uno y doce e imprima el número de
días que tiene el mes correspondiente.'''

num = int(input("Pon un número entre 1 y 12 incluyéndose ambos, y diŕe los días que tiene ese mes: "))


if ((num == 1) or (num == 3) or (num == 5) or (num == 7) 
    or (num == 8) or (num == 10) or (num == 12)) :
    print("Ese mes tiene 31 días.")

elif ((num == 2)) :
    print("Ese mes tiene 28 días (o 29 si es un año bisiesto)")
    
elif ((num == 4) or (num == 6) or (num == 9) or (num == 11)) :
    print("Ese mes tiene 30 días.")

else :
    print("Has puesto un número no válido. Acata las normas o no funciona esto.")