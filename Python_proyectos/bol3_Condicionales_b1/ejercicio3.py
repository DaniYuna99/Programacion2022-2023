'''
Created on 25 sept 2022

@author: Daniel
'''

'''3. Realizar un programa que lea un 
número por teclado. El programa debe
imprimir en pantalla un mensaje con 
“El número xx es múltiplo de 2” o un
mensaje con “El número xx es múltiplo 
de 3”. Si es múltiplo de 2 y de 3
deben aparecer los dos mensajes. Si no 
es múltiplo de ninguno de los dos el 
programa finaliza sin mostrar ningún mensaje.'''

numero = int(input("Dime un número: "))


if (numero % 2 == 0) :
    print(f"El número {numero} es múltiplo de 2.")

if (numero % 3 == 0) :
    print(f"El número {numero} es múltiplo de 3.")