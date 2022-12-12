'''
Created on 6 dic 2022

@author: Daniel
'''

'''
5. Queremos crear un programa que trabaje con fracciones de la forma a/b. Para
representar una fracción vamos a utilizar dos enteros: numerador y denominador,
creando las siguientes funciones para trabajar con ellas:

    1. leer_fracción: La tarea de esta función es leer por teclado el numerador y el
    denominador y la devuelve simplificada (Por ejemplo, si recibe 16/6 ⇒ 8/3)

    2. escribir_fracción: muestra por pantalla la fracción; si el denominador es 1, se
    muestra sólo el numerador.

    3. calcular_mcd: Esta función recibe dos números y devuelve su máximo común
    divisor.

    4. simplificar_fracción: simplifica una fracción. Para ello hay que dividir el
    numerador y denominador por su MCD.

    5. sumar_fracciones: recibe dos funciones n1/d1 y n2/d2 y calcula su suma. La
    suma de dos fracciones es otra fracción cuyo numerador n=n1*d2+d1*n2 y
    denominador d=d1*d2, simplificando la fracción resultado.

    6. restar_fracciones: resta dos fracciones, siendo el numerador de la resta
    n=n1*d2-d1*n2 y el denominador d=d1*d2, simplificando el resultado.

    7. multiplicar_fracciones: recibe dos fracciones y calcula su producto, siendo el
    numerador del producto n=n1*n2 y el denominador d=d1*d2 (simplificando).

    8. dividir_fracciones: calcula el cociente de dos fracciones, siendo el numerador
    n=n1*d2 y denominador d=d1*n2 (simplificando el resultado).
    
    
6. Házle un menú a las funciones de suma, resta, multiplicación y división.
'''


''' *************************************************************************************** '''        
''' ************************************** FUNCIONES ************************************** '''    
''' *************************************************************************************** ''' 

# ****************************************************
# ******************** APARTADO 1 ********************
# ****************************************************

''' ==================== Función leerFraccion (numerador, denominador) ==================== '''
def leerFraccion (numerador, denominador) :
    
    numeradorCopia = numerador 
    denominadorCopia = denominador
    
    
    for posibleDivisor in (2, (denominador + 1)) :
        
        if ((numeradorCopia % posibleDivisor == 0) and (denominadorCopia % posibleDivisor == 0)) :
            numeradorCopia = numeradorCopia // posibleDivisor
            denominadorCopia = denominadorCopia // posibleDivisor
        
        
    return (str(numeradorCopia) + "/" + str(denominadorCopia))



# ****************************************************
# ******************** APARTADO 2 ********************
# ****************************************************

''' ================== Función escribirFraccion (numerador, denominador) ================== '''
def escribirFraccion (numerador, denominador) :
    
    if (denominador == 1) :
        print(numerador) 
    
    else :
        print(str(numerador) + "/" + str(denominador))
        


# ****************************************************
# ******************** APARTADO 3 ********************
# ****************************************************
        # Funciones tomadas el ejercicio 2

''' ========================== Función obtenerDivisores (number) ======================== '''
def obtenerDivisores (number) :
    
    listDivisors = [] 
    
    
    for i in range (1, (number + 1)) :
        
        if (number % i == 0) :
            listDivisors.append(i)
            
        
    return (listDivisors)


''' =============== Función obtenerMaximoComunDivisor (number1, number2) =============== '''
def obtenerMaximoComunDivisor (number1, number2) :
    
    GCD = 0
    
    n1Divisors = obtenerDivisores(number1)
    n2Divisors = obtenerDivisores(number2)
    
    
    for N1 in (n1Divisors) :
        
        for N2 in (n2Divisors) :
            
            if ((N1 == N2) and (N2 > GCD)) :
                GCD = N2
    
    
    return (GCD)
    
    
    
# ****************************************************
# ******************** APARTADO 4 ********************
# ****************************************************    

''' =============== Función simplificarFraccion (numerador, denominador) =============== '''
def simplificarFraccion (numerador, denominador) :
    
    maximoDivisor = obtenerMaximoComunDivisor(numerador, denominador)
    resultado = ""
    
    if (numerador != 0 and denominador != 0) :
        numerador = numerador // maximoDivisor
        denominador = denominador // maximoDivisor
    
    else :
        numerador = None 
        denominador = None
    
    
    if (denominador == 1) :
        resultado = str(numerador)
    
    else :
        resultado = str(numerador) + "/" + str(denominador)
        
        
    return (resultado)



# ****************************************************
# ******************** APARTADO 5 ********************
# ****************************************************

''' ================== Función extraerNumeradorYDenominador (fraccion) ==================== '''
def extraerNumeradorYDenominador (fraccion) :
    
    barraEncontrada = False
    numerador = ""
    denominador = ""
    fraccion = fraccion.replace(" ", "")
    
    
    for caracter in (fraccion) :
        
        if (caracter == "/") :
            barraEncontrada = True
            
        elif (caracter.isdigit() and barraEncontrada == False) :
            numerador += caracter
        
        elif (caracter.isdigit() and barraEncontrada == True) :
            denominador += caracter
            
    
    return (int(numerador), int(denominador))


        
''' =================== Función sumarFracciones (fraccion1, fraccion2) ==================== '''
def sumarFracciones (fraccion1, fraccion2) :
    
    numerador1, denominador1 = extraerNumeradorYDenominador(fraccion1)
    numerador2, denominador2 = extraerNumeradorYDenominador(fraccion2)
    
    trueNumerador = ((numerador1 * denominador2) + (denominador1 * numerador2))
    trueDenominador = (denominador1 * denominador2)
    
    
    return(simplificarFraccion(trueNumerador, trueDenominador))



# ****************************************************
# ******************** APARTADO 6 ********************
# ****************************************************

''' =================== Función restarFracciones (fraccion1, fraccion2) ==================== '''
def restarFracciones (fraccion1, fraccion2) :
    
    numerador1, denominador1 = extraerNumeradorYDenominador(fraccion1)
    numerador2, denominador2 = extraerNumeradorYDenominador(fraccion2)
    
    trueNumerador = ((numerador1 * denominador2) - (denominador1 * numerador2))
    trueDenominador = (denominador1 * denominador2)
    
    
    
    
    return(simplificarFraccion(trueNumerador, trueDenominador))


# ****************************************************
# ******************** APARTADO 7 ********************
# ****************************************************

''' ================ Función multiplicarFracciones (fraccion1, fraccion2) ================= '''
def multiplicarFracciones (fraccion1, fraccion2) :
    
    numerador1, denominador1 = extraerNumeradorYDenominador(fraccion1)
    numerador2, denominador2 = extraerNumeradorYDenominador(fraccion2)
    
    trueNumerador = (numerador1 * denominador2)
    trueDenominador = (denominador1 * numerador2)
    
    print(f"El resultado de la multiplicación entre {fraccion1} y {fraccion2} es: ")
    
    
    return(simplificarFraccion(trueNumerador, trueDenominador))


# ****************************************************
# ******************** APARTADO 8 ********************
# ****************************************************

''' ================== Función dividirFracciones (fraccion1, fraccion2) =================== '''
def dividirFracciones (fraccion1, fraccion2) :
    
    numerador1, denominador1 = extraerNumeradorYDenominador(fraccion1)
    numerador2, denominador2 = extraerNumeradorYDenominador(fraccion2)
    
    trueNumerador = (numerador1 * numerador2)
    trueDenominador = (denominador1 * denominador2)
    
    print(f"El resultado de la división entre {fraccion1} y {fraccion2} es: ")
    
    
    return(simplificarFraccion(trueNumerador, trueDenominador))


''' =================================== Función menu () =================================== '''
def menu () :
    
    print(("*" * 50) + "\n"
          + "1. Leer fracción\n"
          + "2. Escribir fracción\n"
          + "3. Calcular Máximo Común Divisor\n"
          + "4. Simplificar fracción\n"
          + "5. Sumar fracciones\n"
          + "6. Restar fracciones\n"
          + "7. Multiplicar fracciones\n"
          + "8. Dividir fracciones\n"
          + "9. Salir\n"
          + ("*" * 50))
    
    
    
''' *************************************************************************************** '''        
''' *************************************** MAINAPP *************************************** '''    
''' *************************************************************************************** '''
    
eleccionMenu = 1


while (eleccionMenu != 9) :
    
    menu()
    
    
    #Variable "eleccionMenu"
    eleccionMenu = int(input("Elige: "))
    
    while (eleccionMenu not in [1,2,3,4,5,6,7,8,9]) :
        eleccionMenu = int(input("Error. Elige bien: "))
        
    
    print("-" * 50)
    
    
    # ---------------------------------- IFs ----------------------------------
    if (eleccionMenu == 1) :
        
        numerador = int(input("Introduce el numerador de la fracción: "))
        denominador = int(input("Introduce el denominador de la fracción: "))
        
        print("\nLa lectura de la fracción creada (y simplificada si es posible) es: ")
        print(leerFraccion(numerador, denominador))
    

    elif (eleccionMenu == 2) :
        
        numerador = int(input("Introduce el numerador de la fracción: "))
        denominador = int(input("Introduce el denominador de la fracción: "))
        
        print("\nLa escritura de la fracción creada (y simplificada si es posible) es: ")
        escribirFraccion(numerador, denominador)
        
        
    elif (eleccionMenu == 3) :
        
        num1 = int(input("Introduce el primer número: "))
        num2 = int(input("Introduce el segundo número: "))
        
        print("\nEl Máximo Común Divisor de ambos números es: ")
        print(obtenerMaximoComunDivisor(num1, num2))
        
        
    elif (eleccionMenu == 4) :
        
        numerador = int(input("Introduce el numerador de la fracción: "))
        denominador = int(input("Introduce el denominador de la fracción: "))
        
        print("\nLa simplificación de la función recién creada es: ")
        print(simplificarFraccion(numerador, denominador))
        
        
    elif (eleccionMenu == 5) :
        
        fraccion1 = input("Dime la primera fracción (formato '23/5'): ")
        fraccion2 = input("Dime la segunda fracción: ")
        
        print(f"\nEl resultado de la suma entre {fraccion1} y {fraccion2} es: ")
        print(sumarFracciones(fraccion1, fraccion2))
        
        
    elif (eleccionMenu == 6) :
        
        fraccion1 = input("Dime la primera fracción (formato '23/5'): ")
        fraccion2 = input("Dime la segunda fracción: ")
        
        print(f"\nEl resultado de la resta entre {fraccion1} y {fraccion2} es: ")
        print(restarFracciones(fraccion1, fraccion2))
        
        
    elif (eleccionMenu == 7) :
        
        fraccion1 = input("Dime la primera fracción (formato '23/5'): ")
        fraccion2 = input("Dime la segunda fracción: ")
        
        print(f"\nEl resultado de la multiplicación entre {fraccion1} y {fraccion2} es: ")
        print(multiplicarFracciones(fraccion1, fraccion2))
        
        
    elif (eleccionMenu == 8) :   

        fraccion1 = input("Dime la primera fracción (formato '23/5'): ")
        fraccion2 = input("Dime la segunda fracción: ")
        
        print(f"\nEl resultado de la división entre {fraccion1} y {fraccion2} es: ")
        print(dividirFracciones(fraccion1, fraccion2))
    
    
    if (eleccionMenu != 9) :
        print("\n")


print("Te has salido del programa.")








