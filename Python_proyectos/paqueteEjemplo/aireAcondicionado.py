'''
Created on Sep 26, 2022

@author: estudiante
'''

temperatura = int(input("Introduce una temperatura en grados centígrados: "))
llueve = str(input("¿Está lloviendo ahora mismo? (S/N) "))
llueve = llueve.upper()

if (temperatura > 25) :
    print("Encendiendo aire acondicionado.")
    print("A refrescarse.")
    
elif (temperatura > 15 and temperatura <= 25) :
    print("Encendemos ventilador.")
   
elif (temperatura > 10 and temperatura <= 15) :
    print("No hacemos nada; la temperatura es adecuada.")
    
else :
    print("Encendiendo la calefacción.")
    
    if (llueve == "S") :
        print("Coge un paraguas.")
    else :
        print("...")
    
    
print("Hasta mañana.")



'''edad = int(input("Dime tu edad: "))


if (edad >= 18) :
    print("Eres mayor de edad.")

else :
    print("Eres menor de edad.")'''
    
    
    
    
    
    