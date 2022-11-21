'''
Created on Oct 31, 2022

@author: estudiante
'''

'''EJERCICIO 1.2: EXPANSIÓN DE PIEDRA, PAPEL, TIJERAS, LAGARTO, SPOCK'''

def esEleccionValida (eleccion) :
    
    esValido = True
    eleccion = eleccion.upper()
    
    if (eleccion != "TIJERAS" and eleccion != "PAPEL" and eleccion != "PIEDRA" 
            and eleccion != "LAGARTO" and eleccion != "SPOCK") :
        esValido = False
    
    
    return esValido
    

''' ===== MAINAPP ===== '''
print("Juego de 'Piedra, papel, tijeras, lagarto, Spock'.")

resultado = ""

print("*" * 30)

#ELECCION1
eleccion1 = input("¿Cuál es la primera tirada? ").upper()

while (esEleccionValida(eleccion1) == False) :
    eleccion1 = input("La primera tirada no es válida. Introduce Piedra, Papel, Tijeras, Lagarto o Spock: ").upper()


#ELECCION2
eleccion2 = input("¿Cuál es la segunda tirada? ").upper()

while (esEleccionValida(eleccion2) == False) :
    eleccion2 = input("La segunda tirada no es válida. Introduce Piedra, Papel, Tijeras, Lagarto o Spock: ").upper()


#WHILE QUE REPRODUCIRÁ EL PROGRAMA ETERNAMENTE HASTA QUE SE INTRODUZCA DOS VECES SPOCK
while (eleccion1 != "SPOCK" or eleccion2 != "SPOCK") :

    #IFs
    if (eleccion1 == eleccion2) :
        resultado = "Empate."
    
    
    elif (eleccion1 == "TIJERAS") :
        
        if (eleccion2 == "LAGARTO") :
            resultado = "Tijeras decapita a Lagarto."
        
        elif (eleccion2 == "PAPEL") :
            resultado = "Tijeras corta Papel."
        
        elif (eleccion2 == "PIEDRA") :
            resultado = "Tijeras es aplastada por Piedra."
        
        else :
            resultado = "Tijeras es destruida por Spock."
        
    
    elif (eleccion1 == "PAPEL") :
        
        if (eleccion2 == "PIEDRA") :
            resultado = "Papel envuelve a Piedra."
        
        elif (eleccion2 == "SPOCK") :
            resultado = "Papel desautoriza a Spock."
            
        elif (eleccion2 == "TIJERAS") :
            resultado = "Papel es cortado por Tijeras."
            
        else :
            resultado = "Papel es devorado por Lagarto."
            
        
    elif (eleccion1 == "PIEDRA") :
        
        if (eleccion2 == "TIJERAS") :
            resultado = "Piedra aplasta a Tijeras."
        
        elif (eleccion2 == "LAGARTO") :
            resultado = "Piedra aplasta a Lagarto."
            
        elif (eleccion2 == "SPOCK") :
            resultado = "Piedra es vaporizada por Spock."
        
        else :
            resultado = "Piedra es envuelta por Papel."
            
     
    elif (eleccion1 == "LAGARTO") :
        
        if (eleccion2 == "SPOCK") :
            resultado = "Lagarto envenena a Spock."
        
        elif (eleccion2 == "PAPEL") :
            resultado = "Lagarto devora a Papel." 
            
        elif (eleccion2 == "PIEDRA") :
            resultado = "Lagarto es aplastado por Piedra."
        
        else : 
            resultado = "Lagarto es decapitado por Tijeras."
        
    
    else :
        
        if (eleccion2 == "PIEDRA") :
            resultado = "Spock vaporiza a Piedra."
        
        elif (eleccion2 == "TIJERAS") :
            resultado = "Spock rompe Tijeras." 
            
        elif (eleccion2 == "PAPEL") :
            resultado = "Spock es desautorizado por Papel."
    
        else :
            resultado = "Spock es envenenado por Lagarto."
            
    
    print("*" * 30)      
    print(resultado)   
    
    print("*" * 30)
    
    #ELECCION1
    eleccion1 = input("¿Cuál es la primera tirada? ").upper()
    
    while (esEleccionValida(eleccion1) == False) :
        eleccion1 = input("La tirada no es válida. Introduce Piedra, Papel, Tijeras, Lagarto o Spock: ").upper()
    
    #ELECCION2
    eleccion2 = input("¿Cuál es la segunda tirada? ").upper()
    
    while (esEleccionValida(eleccion2) == False) :
        eleccion2 = input("La tirada no es válida. Introduce Piedra, Papel, Tijeras, Lagarto o Spock: ").upper()
        

print("*" * 30)   
print("Has salido del programa al introducir 'Spock' dos veces.")
        
        
        
        
        
        
        
    
    
    
    
    