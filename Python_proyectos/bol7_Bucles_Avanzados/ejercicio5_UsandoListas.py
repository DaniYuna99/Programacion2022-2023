'''
Created on Oct 24, 2022

@author: estudiante
'''

'''5. La secuencia siguiente está definida 
para el conjunto de los números enteros:

    n → n/2 (n es par)
    n → 3n + 1 (n es impar)

Utilizando la función anterior y empezando en 13 se genera la siguiente secuencia
de números:

    13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
    
Esta secuencia tiene 10 términos y se cree que cualquier secuencia termina en 1.
Elabora un programa que pida un número n e imprima una cadena con la secuencia
de números hasta llegar a 1.'''


''' ==== FUNCION CREARSECUENCIA() ==== '''
def crearSecuencia (numero) :
    
    lista = []
    resultado = numero
    
    
    while (resultado != 1) :
    
        if (resultado % 2 == 0) :
            resultado = (resultado / 2)
             
        else :
            resultado = ((3 * resultado) + 1)
     
        
        lista.append(int(resultado))


    return lista



''' ===== MAINAPP ===== '''

numeroInicio1 = int(input("Introduce un número, y crearé una secuencia empezando desde él: "))
numeroInicio2 = int(input("Otro número, crearé su secuencia y diré si ha creado una secuencia del mismo tamaño que el número anterior: "))

secuencia1 = crearSecuencia(numeroInicio1)
secuencia2 = crearSecuencia(numeroInicio2)


print("\n" + ("*" * 30))
print("Las secuencias resultantes: ")
print("*" * 30)

print(f"Número {numeroInicio1} -> {secuencia1}")
print(f"Número {numeroInicio2} -> {secuencia2}")

print("\n" + ("*" * 30))


if (len(secuencia1) == len(secuencia2)) :
    print("Ambas secuencias han producido una lista con el mismo tamaño.")

else :
    print("Las dos secuencias tienen tamaños diferentes.")

    
    




