'''
Created on Oct 31, 2022

@author: estudiante
'''

''' EJERCICIO 3 '''


''' --------------------------------- '''
''' ----------- FUNCIONES ----------- '''
''' --------------------------------- '''

def registrarEmpleado () :
    
    #EDAD
    print("*" * 30)
    
    edad = int(input("Edad del empleado: "))
    
    while (edad < 18 or edad > 65) :
        edad = int(input("La edad debe de figurar entre 18 y 65. Introduce la edad de nuevo: "))
    
        
    #SEX0
    sexo = input("Sexo del empleado (H-M): ").upper()    
        
    while (sexo != "H" and sexo != "M") :
        sexo = input("Dato incorrecto. Introduce el sexo del empleado de nuevo: ").upper()   
    
    
    #LENGUAJEHABITUAL
    lenguajeHabitual = input("¿Cuál es el lenguaje de programación habitual del empleado (Python o Java): ").upper()   
     
    while (lenguajeHabitual != "PYTHON" and lenguajeHabitual != "JAVA") :    
        lenguajeHabitual = input("Incorrecto. Python o Java: ").upper()   
        
    
    return edad, sexo, lenguajeHabitual



''' ------------------------------- '''
''' ----------- MAINAPP ----------- '''
''' ------------------------------- '''

#TAMANO DE LA EMPRESA (PARA HACER BUCLES FOR)
tamano = int(input("Dime el tamaño de la empresa. Es decir, cuántos empleados tiene contratados: "))

while (tamano <= 0) :
    tamano = int(input("Una empresa debe de tener empleados. Introduce el tamaño de nuevo: "))


hombresPython = 0
mujeresPython = 0
hombresJava = 0
mujeresJava = 0
edadPython = 0
edadJava = 0
porcentajePython = 0.0
porcentajeJava = 0.0


for i in range (tamano) :
    
    edad, sexo, lenguajeHabitual = registrarEmpleado()
    
    
    # --------- A PARTIR DE AQUI, IFs ----------
    if (sexo == "H" and lenguajeHabitual == "PYTHON") :
        hombresPython += 1    
        edadPython += edad
    
    elif (sexo == "M" and lenguajeHabitual == "PYTHON") :
        mujeresPython += 1 
        edadPython += edad
    
    elif (sexo == "H" and lenguajeHabitual == "JAVA") :
        hombresJava += 1
        edadJava += edad 
        
    else :
        mujeresJava += 1 
        edadJava += edad


print("*" * 30)   


#Ifs que detectan si hay un 0, para que no salte una Exception parando el programa  
if ((hombresPython + mujeresPython) == 0) :     
    
    print(f"El 0 % de empleados utiliza Python, de los que 0 son hombres, y 0 mujeres. Su edad media es 0 años.")
    
    porcentajeJava = ((hombresJava + mujeresJava) / tamano) * 100
    
    print(f"El {porcentajeJava} % de empleados utiliza Java, de los que {hombresJava} son hombres, y {mujeresJava} mujeres. La edad media es {edadJava / (hombresJava + mujeresJava)} años.")


elif ((hombresJava + mujeresJava) == 0) :
    
    porcentajePython = ((hombresPython + mujeresPython) / tamano) * 100

    print(f"El {porcentajePython} % de empleados utiliza Python, de los que {hombresPython} son hombres, y {mujeresPython} mujeres. La edad media es {edadPython / (hombresPython + mujeresPython)} años.")
    print(f"El 0 % de empleados utiliza Java, de los que 0 son hombres, y 0 mujeres. Su edad media es 0 años.")


else :
    
    porcentajePython = ((hombresPython + mujeresPython) / tamano) * 100
    porcentajeJava = ((hombresJava + mujeresJava) / tamano) * 100
    
    print(f"El {porcentajePython} % de empleados utiliza Python, de los que {hombresPython} son hombres, y {mujeresPython} mujeres. La edad media es {edadPython / (hombresPython + mujeresPython)} años.")
    print(f"El {porcentajeJava} % de empleados utiliza Java, de los que {hombresJava} son hombres, y {mujeresJava} mujeres. La edad media es {edadJava / (hombresJava + mujeresJava)} años.")
    
    
    