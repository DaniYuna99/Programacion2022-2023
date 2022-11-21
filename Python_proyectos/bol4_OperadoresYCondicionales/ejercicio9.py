'''
Created on Sep 27, 2022

@author: estudiante
'''

'''9. Realiza un algoritmo que calcule la potencia, para 
ello pide por teclado la base y el exponente. Pueden 
ocurrir tres cosas:

◦ El exponente sea positivo, sólo tienes que imprimir la potencia.
◦ El exponente sea 0, el resultado es 1.
◦ El exponente sea negativo, el resultado es 1/potencia 
  con el exponente positivo.'''

#Función con un bucle For para calcular potencias
def sacarPotencia (base, exponente) :
    
    resultado = 1
    
    for i in range (0, exponente) :
        resultado = resultado * base 
    
    return resultado



''' ======= MAINAPP ======= '''  
      
base = int(input("Introduce la base: "))
exponente = int(input("Introduce el exponente con el que elevarás la base: "))
resultado = 1


if (exponente > 0) :
    
    resultado = sacarPotencia(base, exponente)
       
elif (exponente < 0) :
    
    resultado = sacarPotencia(base, exponente)
        
    resultado = 1 / resultado
    

print(f"El resultado tras realizarse la potencia correspondiente es {resultado}.")







    