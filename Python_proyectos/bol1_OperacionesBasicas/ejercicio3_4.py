'''
Created on Sep 22, 2022

@author: estudiante
'''


'''3. Escribir una expresión lógica que cumpla: 

    a) Debe ser Verdadera si el contenido 
    de la variable entera precio es igual 
    o superior a 60 euros pero igual o 
    inferior a 420 euros.
    
    b) Debe ser Verdadera si el numero 
    contenido en la variable entera 
    numero es impar.
    
    c) Debe ser Verdadera si las dos 
    variables enteras saldo de una 
    cuenta, y dineroSacar son
    válidas.
    
    d) Debe ser Verdadera si las 
    variables enteras hora y minutos 
    son correctas, es decir, que
    estén comprendidas entre 0:0 y 23:59.
    
    e) Debe ser Verdadera si la variable 
    estadoCivil que almacena el estado 
    civil de una persona no es correcta 
    (S-Soltero, C-Casado, V-Viudo, D-Divorciado).
    
        NOTA: Además siempre debe ser Falsa 
        en el caso contrario al que se formula.'''


# --- a) ---
'''precio = int(input("Dime un precio en euros: "))


if (precio >= 60 and precio <= 420) :
    print(True)

else : 
    print(False)'''


# --- b) ---
'''numero = int(input("Dime un número y diré si es par o impar: "))


if (numero % 2 == 0) :
    print(numero, "es un número par.")
    
else : 
    print(numero, "es un número impar.")'''
    
    
# --- c) ---
'''
saldo = int(input("¿Cuál es el saldo de la cuenta? "))
dineroASacar = int(input("¿Cuánto dinero vas a sacar de la cuenta? "))


if (saldo >= dineroASacar) :
    print("Has sacado", dineroASacar, "euros. El saldo de la cuenta actual es", (saldo - dineroASacar))    

else :
    print("No es posible sacar más dinero que el que hay depositado en la cuenta.")'''


# --- d) ---
'''
horas = int(input("Dime las horas: "))


if (horas < 24 and horas >= 0) :
    minutos = int(input("Dime los minutos: "))
    
    if (minutos < 60 and minutos >= 0) :
        print(f"La hora introducida es: {horas}:{minutos}.")
    
    else :
        print("Los minutos no deben de ser mayores que 59 ni menores que 0.")
    
else :
    print("Las horas no deben de ser mayores que 23 ni menores que 0.")
'''
   
    
# --- e) ---
estadoCivil = str(input("Dime el estado civil de la persona: "))
estadoCivil = estadoCivil.upper()


if (estadoCivil == "S" or estadoCivil == "C" or estadoCivil == "V" or estadoCivil == "D") :
    print(False)
    
else :
    print(True)




'''4. Escribir una expresión lógica que cumpla:

    a) Debe ser Falsa cuando la variable cantidad que contiene la 
    cantidad a sacar de un cajero es superior a 300 euros o negativa.
    
    b) Debe ser Falsa si la persona es un adolescente, 
    es decir, la variable edad está entre 16-22 años.
    
    c) Debe ser Falsa si la variable respuesta a una pregunta 
    de tipo (S/N) es válida.
    
    d) Debe ser Falsa si el número contenido en la variable 
    entera numero es múltiplo de 7 o de 3.
    
        NOTA: Además siempre debe ser Verdadera en el caso contrario al que se formula.
'''
    
# --- a) ---
dinero = int(input("Dime cuánto quieres sacar: "))


if (dinero < 0 or dinero > 300) :
    print(False)
    
else :
    print(True)    
    
  
# --- b) ---  
edad = int(input("Dime tu edad: "))


if (edad < 16 or edad > 22) :
    print(False)
    
else :
    print(True)
    
    
# --- c) ---
respuesta = str(input("¿Has comido alguna vez una pizza con piña? (S/N)"))


if (respuesta == "S" or respuesta == "N") :
    print(False)
    
else : 
    print(True)


# --- d) ---
num = int(input("Dime un número: "))


if (num % 3 == 0 or num % 7 == 0) :
    print(False)

else : 
    print(True)
    
    
    
    

