'''
Created on 8 nov 2022

@author: Daniel
'''

'''5. Realiza una función reverse que reciba una 
lista y devuelva una nueva lista cuyo contenido 
sea igual a la original pero invertida. Así, dada 
la lista [‘Di’, ‘buen’, ‘día’, ‘a’, ‘papa’], 
deberá devolver [‘papa’, ‘a’, ‘día’, ‘buen’, ‘Di’].'''


lista = []
listaInvertida = []


eleccion = "Y"


while (eleccion == "Y") :
    
    palabra = input("Dime una palabra: ")
    
    lista.append(palabra)
    
    eleccion = input("¿Quieres seguir introduciendo palabras? (Y/N) ").upper()

    
for palabra in range ((len(lista) - 1), -1, -1) :
    listaInvertida.append(lista[palabra])


print("*" * 40)
print(f"Lista recién creada por ti: {lista}")
print(f"Lista con las palabras invertidas: {listaInvertida}")