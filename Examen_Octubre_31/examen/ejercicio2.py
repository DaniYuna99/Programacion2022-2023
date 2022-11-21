'''
Created on Oct 31, 2022

@author: estudiante
'''

'''EJERCICIO 2: SISTEMA INFORMÁTICO IES JACARANDÁ''' 

def menu () :
    
    print("####################################################")
    print("# ¡¡Bienvenido a IES Jacarandá !!:                 # ")
    print("      1. Alumnos que han entrado ")
    print("      2. Alumnos que han abandonado el centro")
    print("      3. Alumnos en el IES")
    print("      4. Salir")
    print("####################################################")


''' ======== MAINAPP ======== '''
    
menu()
eleccion = int(input("Elige la opción: "))

while (eleccion < 1 or eleccion > 4) :
    print("\n")
    menu()
    eleccion = int(input("Error. Introduce correctamente la elección: "))
    
alumnosTotales = 0
alumnosIdosTotales = 0
alumnosEntradosTotales = 0
 


while (eleccion != 4) :
    
    print("*" * 50)
    
    if (eleccion == 1) :
        
        alumnosEntrados = int(input("Introduce cuántos alumnos entraron en el centro: "))
        
        while (alumnosEntrados < 0) :
            alumnosEntrados = int(input("No hay tal cosa como alumnos negativos. Introduce de nuevo: "))
           
            
        alumnosEntradosTotales += alumnosEntrados
        alumnosTotales += alumnosEntrados
        
        print(f"Han entrado un total de {alumnosEntradosTotales} hoy en el centro.")
    
    
    elif (eleccion == 2) :
        
        alumnosIdos = int(input("Introduce cuántos alumnos abandonaron en el centro: "))
    
        while (alumnosIdos < 0) :
            alumnosIdos = int(input("No hay tal cosa como alumnos negativos. Introduce de nuevo: "))
        
        alumnosIdosTotales += alumnosIdos

        if (alumnosTotales - alumnosIdos < 0) :
            alumnosTotales = 0
        
        else :
            alumnosTotales -= alumnosIdos
        
        print(f"Han abandonado el centro hoy un total de {alumnosIdosTotales} alumnos.")
        
    
    elif (eleccion == 3) :
        
        print(f"En el centro, hay un total de {alumnosTotales} alumnos dando clase.")
    
    
    print("\n")
    menu()
    eleccion = int(input("Elige la opción: "))
    
    while (eleccion < 1 or eleccion > 5) :
        print("\n\n")
        menu()
        eleccion = int(input("Error. Introduce correctamente la elección: "))
    

print("*" * 50)       
print("Has salido del programa.")  
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    