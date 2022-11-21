'''3. Diseñar un programa que muestre, para 
cada número introducido por teclado, si es
par, si es positivo y su cuadrado. El proceso 
se repetirá hasta que el número introducido 
por teclado sea 0. Por ejemplo:

    4 ⇒ es par, positivo y su cuadrado es 16
    -7 ⇒ es impar, negativo y su cuadrado es 49'''

numero = int(input("Dime un número. Te diré si es par o impar, y también su cuadrado: "))


while (numero != 0) :
    
    resultado = ""
    
    
    if (numero % 2 == 0) :
        resultado += f"{numero} es par, "
    
    else :
        resultado += f"{numero} es impar, "
    
    
    if (numero < 0) :
        resultado += "negativo "
    
    else :
        resultado += "positivo "


    print(f"{resultado}y su cuadrado es {numero ** 2}.")
    
    
    print("*" * 30) 
    numero = int(input("Inserta otro número para seguir. Inserta 0 para salir del programa: "))

 
print("*" * 30)
print("Saliste del programa. Au revoir.")





