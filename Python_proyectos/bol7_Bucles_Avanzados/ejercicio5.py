'''
Created on Oct 17, 2022

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

numeroInicio = int(input("Introduce un número, y crearé una secuencia empezando desde él: "))
resultado = numeroInicio

print("*" * 30)
print("La secuencia resultante: ")
print("*" * 30)


while (resultado != 1) :
    
    if (resultado % 2 == 0) :
        resultado = (resultado / 2)
    
    else :
        resultado = ((3 * resultado) + 1)
    
    
    print(int(resultado))
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        