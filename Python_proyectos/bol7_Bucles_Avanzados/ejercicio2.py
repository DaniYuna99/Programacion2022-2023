'''
Created on Oct 14, 2022

@author: estudiante
'''

'''2. Diseñar un programa que pida dos 
números enteros y nos muestre los siguientes
números que son múltiplos del segundo introducido 
a partir del primero. Por ejemplo, si introducimos:

    13 y 7 ⇒ 14, 21, 28, 35, 42, 49, 56, 63, 70, 77

(a partir de 13 los siguientes 10 múltiplos de 7)'''

num1 = int(input("Primer número: "))

while (num1 <= 0) :
    num1 = int(input("No se permiten números negativos. Introduce otro número: "))


num2 = int(input("Segundo número: "))

while (num2 <= 0) :
    num2 = int(input("No se permiten números negativos. Introduce otro número: "))

    
multiplos = 0
resultado = ""
contador = 0


while (contador < 10) :
    
    multiplos += num2
    
    if (multiplos % num2 == 0) :
        
        if (contador < 9) :
            resultado += str(multiplos) + ", "
        else :
            resultado += str(multiplos) + "."
            
        contador += 1


print("*" * 30)
print(f"Los 10 primeros múltiplos de {num2}, contando a partir de {num1}:")
print(resultado)






