'''
Created on 8 nov 2022

@author: Daniel
'''

'''7. Escribir una función denominada 
encajan que indique si dos fichas de 
dominó encajan o no. Las fichas son 
recibidas en dos cadenas de texto con 
el siguiente formato: [3,4] [2,5]'''

''' === Funciones === ''' 
def comprobarFicha (ficha) :
    
    esValido = False
    
    if ((ficha[0] == "[") and (ficha[1].isdigit()) and (ficha[2] == ",") 
        and (ficha[3].isdigit()) and (ficha[4] == "]")
        and (len(ficha) == 5)) :
        esValido = True
        
    
    return esValido

'''==================='''


''' ======= MAINAPP ======'''

ficha1 = input("Introduce la primera ficha (Formato [num1,num2]): ")

while (comprobarFicha(ficha1) == False) :
    ficha1 = input("Error. Introduce la primera ficha de nuevo. El formato es '[num1,num2]': ")
    
    
ficha2 = input("Introduce la segunda ficha: ")

while (comprobarFicha(ficha2) == False) :
    ficha1 = input("Error. Introduce la segunda ficha de nuevo. El formato es '[num1,num2]': ")


print("*" * 40)


if ((ficha1[3] == ficha2[1]) or (ficha1[1] == ficha2[3])) :
    print(f"Las dos fichas {ficha1} y {ficha2} encajan.")

else :
    print(f"Las dos fichas {ficha1} y {ficha2} no encajan.")
    
    
    
    
    
    
    
    