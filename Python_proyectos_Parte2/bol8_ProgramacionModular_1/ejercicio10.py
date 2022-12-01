'''
Created on Nov 11, 2022

@author: estudiante
'''

'''10. Diseña una función conversor que 
convierta un número de binario a decimal 
o de decimal a binario. Esta función 
recibirá un número en formato de cadena 
de texto cuya última posición indica el 
sistema numérico utilizado (D-decimal, B-binario).

Debe validar la información, así, por ejemplo, 
el número ‘1020101B’ no sería válido
puesto que los valores en binario son 0 y 1.'''


''' *********************************** '''        
''' ************ FUNCIONES ************ '''    
''' *********************************** '''  

'''Función esNumeroBinarioValido(numero) '''
def esNumeroBinarioValido(numero) :
    
    esValido = True
    
    
    for contador in (0, (len(numero) - 2), 1):
        
        if (int(numero[contador]) != 0 and int(numero[contador]) != 1):
            esValido = False
    
    
    return esValido


'''Función convertirANumeroDecimal(numero) '''
def convertirANumeroDecimal(numero) :
    
    numeroBinario = numero[0:len(numero) - 1]
    numeroDecimal = 0
    potenciaDeDos = 2
    
    
    for contador in range ((len(numeroBinario) - 1), -1, -1) :
        
        if (contador == len(numeroBinario) - 1) :
            numeroDecimal += int(numeroBinario[len(numeroBinario) - 1])
        
        else :
            numeroDecimal += int(numeroBinario[contador]) * potenciaDeDos
            potenciaDeDos *= 2
        
        
    return numeroDecimal
 
    
'''Función convertirANumeroBinario(numero) ''' 
def convertirANumeroBinario(numero) :
    
    numeroDecimal = int(numero[0:len(numero) - 1])
    numeroBinarioReves = ""
    numeroBinarioReal = ""
    
    
    while (numeroDecimal != 1) :
        numeroBinarioReves += str(numeroDecimal % 2)
        numeroDecimal = int((numeroDecimal / 2))
    
    
    numeroBinarioReves += str(numeroDecimal % 2)
    
    
    for num in range (len(numeroBinarioReves) - 1, -1, -1) :
        numeroBinarioReal += str(numeroBinarioReves[num])
        
        
    return numeroBinarioReal


 
''' *********************************** '''        
''' ************* MAINAPP ************* '''
''' *********************************** ''' 

# INPUT DE VARIABLE numero. EL BUCLE WHILE DETERMINA SI CONTIENE 
# EL CARACTER QUE IDENTIFICA QUÉ TIPO DE NÚMERO ES          
numero = str(input("Introduce el número y su letra para calcularlo: ")).upper()

while ((numero[len(numero) - 1] != "B" and numero[len(numero) - 1] != "D")) :
    numero = str(input("Error. Introduce el número CON su letra para calcularlo: ")).upper()


# EL RESULTADO FINAL SE IMPRIME EN ESTA VARIABLE BANDERA
resultado = ""


# -------- IFs EMPIEZAN AQUÍ --------
if (numero[len(numero) - 1] == "B") :
    
    # WHILE QUE COMPRUEBA SI EL NÚMERO ES REALMENTE BINARIO. SI NO, LO PIDE DE NUEVO.
    # TAMBIÉN COMPRUEBA SI AL INTRODUCIRLO DE NUEVO, TIENE EL CARACTER "B"
    while ((esNumeroBinarioValido(numero) == False) or (numero[len(numero) - 1] != "B")) :
        numero = str(input("Error. Introduce el número binario correctamente con su letra para calcularlo: ")).upper()
 

    resultado = (f"El número {numero} es {convertirANumeroDecimal(numero)} en binario.")
    

else :   

    resultado = (f"El número {numero} es {convertirANumeroBinario(numero)} en decimal.")


# MUESTRA DEL RESULTADO
print(("*" * 40) + "\n" + resultado)








