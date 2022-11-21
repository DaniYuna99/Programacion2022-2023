'''
Created on 25 sept 2022

@author: Daniel
'''

'''6. Realizar un programa que solicite un 
carácter por teclado e informe por
pantalla si el carácter es una vocal o no 
lo es. Si es una vocal mostrará el
mensaje “Es la primera vocal (A)” o “Es 
la segunda vocal (E)”, etc.'''

caracter = str(input("Introduce la letra: "))
caracter = caracter.upper()


if (caracter == "A") :
    print("Es la primera vocal.")

elif (caracter == "E") :
    print("Es la segunda vocal.")

elif (caracter == "I") :
    print("Es la tercera vocal.")

elif (caracter == "O") :
    print("Es la cuarta vocal.")
    
elif (caracter == "U") :
    print("Es la quinta vocal.")

else :
    print(f"{caracter} no es una vocal.")