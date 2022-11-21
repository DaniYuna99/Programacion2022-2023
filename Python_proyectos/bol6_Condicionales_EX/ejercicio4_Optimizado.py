'''
Created on Oct 11, 2022

@author: estudiante
'''

'''4. Existen cuatro grupos sanguíneos en seres humanos, que se multiplican por dos si
consideramos el factor Rh. Unos grupos son compatibles con otros atendiendo al
criterio que podemos ver en las siguientes tablas.

Grupo     Dona a           Recibe de             Rh        Dona a     Recibe de
A         A, AB             A, 0                 +            +          +, -
B         B, AB             B, 0                 -            +, -         -
AB        AB                A, B, AB, 0
0         A, B, AB, 0       0

Elabora un programa que reciba dos grupos sanguíneos y devuelva si son
compatibles y en qué sentido.
Por ejemplo, si se recibe A y B debería decir que no son compatibles.
Por el contrario, si se recibe 0 y AB debería indicar que son compatibles y AB es
receptor de 0.'''

sangre1 = str(input("Dime el primer grupo sanguíneo (A, B, AB, 0): ")).upper()
sangre2 = str(input("Dime el segundo grupo sanguíneo (A, B, AB, 0): ")).upper()

print("*" * 30)


if ((sangre1 != "A" and sangre1 != "B" and sangre1 != "AB" and sangre1 != "0")
    or (sangre2 != "A" and sangre2 != "B" and sangre2 != "AB" and sangre2 != "0")) :
    
    print("Te has equivocado introduciendo un grupo sanguíneo o ambos.")
    

elif ((sangre1 == "A" and sangre2 == "B") or (sangre1 == "B" and sangre2 == "A")) :
    
    print(f"Los grupos de sangre {sangre1} y {sangre2} son incompatibles. No pueden ni dar ni recibir donantes.")


else :
    
    if (sangre1 == "A" and (sangre2 == "A" or sangre2 == "AB")
        or sangre1 == "B" and (sangre2 == "B" or sangre2 == "AB")
        or sangre1 == "AB" and (sangre2 == "B" or sangre2 == "AB")
        or sangre1 == "0") :
         
        print(f"El grupo sanguíneo {sangre1} puede donar a personas con sangre {sangre2}.")
        
    
    if (sangre1 == "A" and (sangre2 == "A" or sangre2 == "0")
        or sangre1 == "B" and (sangre2 == "B" or sangre2 == "0")
        or sangre1 == "AB" 
        or (sangre1 == "0" and sangre2 == "0")) :
        
        print(f"El grupo sanguíneo {sangre1} puede recibir sangre {sangre2}.")
    
    
    
    
    
    
    
    
    