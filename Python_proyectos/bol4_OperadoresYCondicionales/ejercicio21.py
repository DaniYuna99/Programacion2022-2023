'''
Created on 29 sept 2022

@author: Daniel
'''

'''21. Mostrar en pantalla los N primero 
número primos. Se pide por teclado la cantidad 
de números primos que queremos mostrar.'''

''' ==== Función detectorNumPrimo, sacada de otro ejercicio del año pasado ===='''
def detectorNumPrimo (numero) :
    
    contadorDivisores = 0
    esPrimo = False;
    
    for i in range (numero + 1) :
        if (numero % (i + 1) == 0) :
            contadorDivisores += 1
        
    if (contadorDivisores == 2) :
        esPrimo = True
        
    return esPrimo;



''' ========= MAINAPP ========='''
cantidad = int(input("¿Cuántos números primos quieres ver? "))
contador = 0
numero = 1

print("Cálmate. Cuenta números primos, y cálmate.")


while (cantidad > contador) :
    
    if (detectorNumPrimo(numero) == True) :
        contador = contador + 1
        print(numero)
    
    numero = numero + 1

