'''
Created on Sep 26, 2022

@author: estudiante
'''

'''8. Realizar un programa que lea por 
teclado dos marcaciones de un reloj
digital (horas, minutos, segundos) 
comprendidas entre las 0:0:0 y las
23:59:59 e informe cual de ellas es mayor.

    Ejemplo:
    Hora 1: 12:35:37
    Hora 2: 12:38:36
    “Hora 2 es mayor”'''


print("PRIMERA HORA")
print("--------------------")
horas1 = int(input("Dime las horas: "))
minutos1 = int(input("Dime los minutos: "))
segundos1 = int(input("Dime los segundos: "))

print("--------------------")
print("SEGUNDA HORA")
print("--------------------")
horas2 = int(input("Dime las horas: "))
minutos2 = int(input("Dime los minutos: "))
segundos2 = int(input("Dime los segundos: "))

#Este if es para llamar la atención por si hay valores inválidos.
if ((horas1 > 24 or horas1 < 0) or (minutos1 > 60 or minutos1 < 0) or 
    (segundos1 > 60 or segundos2 < 0) or (horas2 > 24 or horas2 < 0) or 
    (minutos2 > 60 or minutos2 < 0) or (segundos2 > 60 or segundos2 < 0)) :
    print("Alguna hora introducida no es válida.")

#Si hay valores válidos, aquí se produce la comprobación.
else : 
    print("--------------------")
    
    if ((horas1 == horas2) and (minutos1 == minutos2) and (segundos1 == segundos2)) :
        print("Las dos horas son exactamente las mismas.")
        
    elif (horas1 > horas2) :
        print(f"Hora 1 ({horas1}:{minutos1}:{segundos1}) es mayor.")
    
    elif (horas1 < horas2) :
        print(f"Hora 2 ({horas2}:{minutos2}:{segundos2}) es mayor.")
    
    else :
        
        if (minutos1 > minutos2) :
            print(f"Hora 1 ({horas1}:{minutos1}:{segundos1}) es mayor.")
        
        elif (minutos1 < minutos2) :
            print(f"Hora 2 ({horas2}:{minutos2}:{segundos2}) es mayor.")
        
        else :
            
            if (segundos1 > segundos2) :
                print(f"Hora 1 ({horas1}:{minutos1}:{segundos1}) es mayor.")
            
            elif (segundos1 < segundos2) :
                print(f"Hora 2 ({horas2}:{minutos2}:{segundos2}) es mayor.")
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    