'''
Created on Oct 21, 2022

@author: estudiante
'''

'''En el gimnasio Jacafitness para el que ya hemos trabajado nos 
piden que realicemos un programa para determinar si deberías acudir 
al médico para que te haga una revisión, para ello debemos hacer 
las siguientes preguntas:

    - ¿Peso?
    - ¿Edad?
    - ¿Tipo de vida? (Sedentaria/Activa/Muy activa)


El programa terminará si se introduce un peso negativo. Se deben 
comprobar que los datos son correctos y si no lo son, se deben 
volver a preguntar. Las recomendaciones para ir al médico son:

    - Si tienes más de 70 años y lleva una vida Sedentaria
    - Si pesa más de 100 kg sea cual sea la edad.
    - Si pesa más de 74,4 kg y tiene más de 50 años

En cualquier otro caso se mostrará “No es urgente que acuda al 
médico si no tiene problemas de salud”'''


#Variable peso (Si es negativo, acaba el programa porque se va por el Else)
peso = float(input("¿Peso? "))


#If / Else que determina si proseguir con el programa o salir de él
if (peso >= 0) :
    
    #Input edad (Si es negativo o 0, se vuelve a preguntar)
    edad = int(input("¿Edad? "))
    
    while (edad <= 0) :
        print("*" * 30)
        edad = int(input("No existe tal cosa como una edad negativa. Introduce de nuevo: "))
        
        
    #Input tipoVida (Si no es uno de los caracteres válidos, se vuelve a preguntar)  
    tipoVida = input("¿Tipo de vida? (Sedentaria [S] / Activa [A] / Muy activa [MA]) ")
    
    while (tipoVida.upper() != "S" and tipoVida.upper() != "A" and tipoVida.upper() != "MA") :
        print("*" * 30)
        print("Te has equivocado al introducir el tipo de vida.")
        tipoVida = input("Introduce de nuevo (Sedentaria [S] / Activa [A] / Muy activa [MA]) ")
  
    
    print("*" * 30)
    print("PRONÓSTICO:")
    
    
    #If / Else con sus resultados respectivos según qué condiciones
    if ((edad >= 70 and tipoVida == "S")
        or (edad >= 50 and peso >= 74.4)
        or (peso >= 100)) :
        
        print("Te recomendamos que vayas al médico.") 
    
      
    else :
        
        print("No es urgente que acuda al médico si no tiene problemas de salud.")
        
        
#Else que anuncia la salida del programa al introducir una cifra negativa en "peso"       
else :
    
    print("*" * 30)
    print("Has salido del programa.")
    













