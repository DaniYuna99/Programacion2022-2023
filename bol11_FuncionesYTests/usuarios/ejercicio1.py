'''
Created on Dec 2, 2022

@author: estudiante
'''

'''1. Diseña un programa que permite guardar el 
nombre de usuario y contraseña de hasta 10 
usuarios diferentes. Si el usuario ya existe en 
el sistema, puede hacer login tras incluir un 
usuario y contraseña válidas hasta un máximo de 
tres intentos, momento en el que se bloquea su 
cuenta. 

Si el usuario no existe, puede crear 
una cuenta siempre que haya espacio (máximo 10), 
para lo que se le pedirá usuario y contraseña, 
así como la confirmación de ésta última.

El menú de este programa permitirá identificarse 
y crear cuentas nuevas, así como mostrar todos 
los nombres de usuario existentes sin sus contraseñas'''


#SE ME OLVIDÓ PREGUNTAR LA CONTRASEÑA DOS VECES.


''' *************************************************************************************** '''        
''' ************************************** FUNCIONES ************************************** '''    
''' *************************************************************************************** '''  

''' ========================= Función crearNombreUsuario (usuario) ======================== '''
def crearNombreUsuario (usuario, contrasena) :
    
    existeUsuario = False
    
    
    if (len(listaUsuarios) < 10) :
    
        for listitaUsuario in (listaUsuarios) :
            
            if (listitaUsuario[0] == usuario) :
                existeUsuario = True
        
    
        if (existeUsuario == False and usuario not in ["", " "]) :
            listaParaInsertar = []
            listaParaInsertar.append(usuario) 
            listaParaInsertar.append(contrasena)
            listaParaInsertar.append(3) 
            listaUsuarios.append(listaParaInsertar)
            print("Usuario creado.")
        
        elif (usuario in ["", " "]) :
            print("No se ha introducido un nombre de usuario.")
            
        else :
            print(f"El usuario {usuario} ya existe.")
        
    
    else :
        print("La lista de usuarios está llena.")
        
    
    return (existeUsuario)



''' ======================= Función buscarUsuario (usuario, contrasena) ===================== '''

# Esta función extrae la lista con el usuario, contraseña y intentos 
# de la variable "listaUsuarios". Se requiere SÓLO el usuario para buscar.

def buscarUsuario (usuario) :
    
    usuarioEncontrado = ""
    
    
    for listitaUsuario in (listaUsuarios) :
        
        if (listitaUsuario[0] == usuario) :
            usuarioEncontrado = listitaUsuario
                    
    
    return (usuarioEncontrado)
    
    

''' ======================= Función hacerLogin (usuario, contrasena) ======================== '''
def hacerLogin (usuario, contrasena) :
    
    inicioSesion = False
    usuarioEncontrado = buscarUsuario(usuario)
    
    print("*" * 50)
    
    
    if (len(usuarioEncontrado) == 0) :
        print("No se ha encontrado el usuario.")
        
    
    else :
            
        if (usuarioEncontrado[1] != contrasena and usuarioEncontrado[2] > 0) :
            usuarioEncontrado[2] -= 1 
            print(f"Contraseña incorrecta. Te quedan {usuarioEncontrado[2]} intento(s).")
        
        
        elif ((usuarioEncontrado[2] > 0) and (usuarioEncontrado[1] == contrasena)) :
            inicioSesion = True 
            print(f"Has iniciado sesión con el usuario {usuarioEncontrado[0]}.")
        
        
        else :
            print(f"Se han acabado el número de intentos para iniciar sesión. La cuenta está bloqueado.")
        
        
    return (inicioSesion)


    
''' ========================== Función mostrarNombresUsuarios () ========================== '''
def mostrarNombresUsuarios () :
    
    if (len(listaUsuarios) == 0) :
        print("No hay usuarios registrados.")
    
    else :
        listaNombreUsuarios = []
        
        for usuario in (listaUsuarios) :
            listaNombreUsuarios.append(usuario[0])
            
            
        print("La lista de usuarios registrados es la siguiente:\n")
        print(listaNombreUsuarios)
    
        
        
''' ================================ Función menu () ===================================== '''
def menu () :
    
    print("*" * 50 + "\n"
          + "1. Crear un usuario con contraseña\n" 
          + "2. Hacer login\n"
          + "3. Mostrar lista de usuarios registrados\n"
          + "4. Salir\n"
          + "*" * 50)
    
    

''' *************************************************************************************** '''        
''' *************************************** MAINAPP *************************************** '''    
''' *************************************************************************************** '''

listaUsuarios = []
eleccion = 1 


while (eleccion != 4) :
    
    menu() 
    
    eleccion = int(input("Elige: "))
    
    while (eleccion not in [1,2,3,4]) :
        eleccion = int(input("Elige: "))
        
    
    
    # ==== Ifs dependiendo de la variable "eleccion ===="
    
    #Ejecución de la función "crearNombreUsuario()"
    if (eleccion == 1) :
        
        print("-" * 50)
        
        usuario = input("Dime el usuario que quieres crear: ")
        contrasena = input("Dime la contraseña que tendrá el usuario: ")
        
        print("-" * 50)
        
        crearNombreUsuario(usuario, contrasena)
           
        
        
    #Ejecución de la función "hacerLogin()"
    elif (eleccion == 2) :
        
        if (len(listaUsuarios) > 0) :
        
            eleccionFalloLogin = "Y"
            
            
            while (eleccionFalloLogin != "N") :
                
                print("-" * 50)
                
                usuario = input("Dime el usuario al que quieres hacer login: ")
                contrasena = input("Dime la contraseña del usuario: ")
                
                seHaHechoLogin = hacerLogin(usuario, contrasena)
            
            
                if (seHaHechoLogin == False) :
                    
                    eleccionFalloLogin = input("¿Quieres seguir intentando hacer login? (Y/N) ").upper()
                    
                    while (eleccionFalloLogin != "Y" and eleccionFalloLogin != "N") :
                            eleccionFalloLogin = input("Error. Contesta Y o N: ").upper()
                 
                        
                else :
                    eleccionFalloLogin = "N"
                        
        
        else :
            print("La lista de usuarios está vacía. No puedes hacer\n login en una cuenta si no hay ninguna.")
            
    
    
    #Ejecución de la función "hacerLogin()"
    elif (eleccion == 3) :
        print("-" * 50)
        mostrarNombresUsuarios()
    
    
    print("\n")



print("-" * 50)
print("Saliste del programa. Adiós.")
                
        
















