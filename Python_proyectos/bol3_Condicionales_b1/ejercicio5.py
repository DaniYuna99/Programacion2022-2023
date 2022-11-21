'''
Created on 25 sept 2022

@author: Daniel
'''

'''5. Realizar un programa que solicite 
4 números e imprima la media de los
números. También debe imprimir aquellos 
números que son superiores a la
media.'''

num1 = int(input("Dime el primer número: "))
num2 = int(input("Dime el segundo número: "))
num3 = int(input("Dime el tercero número: "))
num4 = int(input("Dime el cuarto número: "))

media = (num1 + num2 + num3 + num4) / 4
print(f"Media de los números: {media}")

numMayores = "Números mayores que la media: "


if (num1 > media) :
    numMayores += str(num1) + " "
    
if (num2 > media) :
    numMayores += str(num2) + " "
    
if (num3 > media) :
    numMayores += str(num3) + " "
    
if (num4 > media) :
    numMayores += str(num4) + " "
    
    
print(numMayores)

