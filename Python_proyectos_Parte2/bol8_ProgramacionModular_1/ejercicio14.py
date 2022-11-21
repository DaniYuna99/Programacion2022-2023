'''
Created on Nov 18, 2022

@author: estudiante
'''

'''14. Escribe una función que, dado una lista con caracteres, 
devuelva la cadena más larga. Si dos o más cadenas miden lo mismo 
y son las más largas, la función devolverá la
que tenga el mayor número de caracteres repetidos .'''


''' ***************************************************** ''' 
''' ***************************************************** '''         
''' ********************* FUNCIONES ********************* '''    
''' ***************************************************** ''' 
''' ***************************************************** ''' 


''' ===== Función contarNumeroCaracteres (palabra) ===== '''

# Función que, como su nombre indica, registra las letras que posee 
# la variable String que le pases. Estrictamente se admiten sólo letras; 
# no registra cifras de ningún tipo, por lo que si el String posee alguna, 
# se obviará.

# Devuelve una lista, con pequeñas listas anidadas por cada letra.  
# Cada lista con la letra tiene como variables la letra primero, luego 
# el número de veces que la ha encontrado en la palabra pasada.

def contarNumeroCaracteres (palabra):
    
    listaLetras = [["A", 0], ["B", 0], ["C", 0], ["D", 0], ["E", 0], ["F", 0], ["G", 0], ["H", 0], 
                   ["I", 0], ["J", 0], ["K", 0], ["L", 0], ["M", 0], ["N", 0], ["Ñ", 0], ["O", 0], 
                   ["P", 0], ["Q", 0], ["R", 0], ["S", 0], ["T", 0], ["U", 0], ["V", 0], ["W", 0], 
                   ["X", 0], ["Y", 0], ["Z", 0]]
    
    
    for caracter in (palabra) :
            
        for letrita in (listaLetras) :
                
            if (caracter.upper() == letrita[0]):
                letrita[1] += 1
        
        
    return (listaLetras)




''' ===== Función extraerLetraMasFrecuente (lista) ===== '''

# Esta función se usa junto a la función contarNumeroCaracteres(). 

# A partir de la lista devuelta de la función contarNumeroCaracteres(), 
# se rebusca y se encuentra la lista pequeña con la letra que aparece 
# más veces.

# Devuelve una lista con la letra y el número de veces que aparece.

def extraerLetraMasFrecuente (listaCaracteresDeUnaLetra):
    
    letraMasFrecuente = listaCaracteresDeUnaLetra[0]
        
        
    for paqueteLetra in (listaCaracteresDeUnaLetra) :
            
        if (letraMasFrecuente[1] < paqueteLetra[1]):
            letraMasFrecuente = paqueteLetra
    
    
    return (letraMasFrecuente)
    
    
    
    
''' ===== Función devolverListaConCadenasMasLargas (lista) ===== '''

# Esta función, a partir de una lista con variables String, encuentra 
# la palabra o palabras con más caracteres, y lo inserta en una lista. 
# Cuenta los caracteres, y no los espacios que hay en medio de la 
# palabra.

# Si dos o más palabras contienen el mismo número de caracteres, se 
# meterán en la lista, y la devolverá.

def devolverListaConCadenasMasLargas (lista) :
    
    mayorNumeroCaracteres = 0
    caracteresPalabra = 0
    listaPalabrasLargas = []
    
    
    for elementoLista in lista:
        
        for caracter in elementoLista:
            
            if (caracter.isalpha()):
                caracteresPalabra += 1
        
        
        if (caracteresPalabra > mayorNumeroCaracteres):
            
            listaPalabrasLargas = []
            listaPalabrasLargas.append(elementoLista)
            mayorNumeroCaracteres = caracteresPalabra
            
            
        elif (caracteresPalabra == mayorNumeroCaracteres):
            
            listaPalabrasLargas.append(elementoLista)
            
            
        caracteresPalabra = 0
    
    
    return (listaPalabrasLargas)




''' ===== Función extraerPalabrasMasFrecuentesDeListaDeCaracteres (lista) ===== '''

# Esta función rebusca en la variable "cadenasMasLargas", que contiene las
# variables String. En cada bucle, usa la función "contarNumeroCaracteres()"
# para generar una lista con el número de caracteres de cada palabra, y luego
# con "extraerLetraMasFrecuente()", de esa lista con caracteres recién generada,
# localiza la mini-lista con la letra más frecuente de esa palabra. Después, inserto 
# la palabra original en esa mini-lista junto con la letra y su número de 
# apariciones en ella para que sea más fácil mostrarla en el resultado

def extraerPalabrasMasFrecuentesDeListaDeCaracteres (cadenasMasLargas) :
    
    listaLetrasMasFrecuentes = []
    
    
    for palabra in cadenasMasLargas:
        
        listaNumeroCaracteres = contarNumeroCaracteres(palabra)
        letraMasFrecuente = extraerLetraMasFrecuente(listaNumeroCaracteres)
        letraMasFrecuente.insert(0, palabra)
        
        listaLetrasMasFrecuentes.append(letraMasFrecuente)
    
    
    return (listaLetrasMasFrecuentes)




''' ***************************************************** ''' 
''' ***************************************************** '''        
''' ********************* MAINAPP *********************** '''
''' ***************************************************** ''' 
''' ***************************************************** ''' 

# Variable lista2, conteniendo Strings. Es el pilar del 
# programa. De aquí, se localiza la palabra más larga y demás
lista2 = []

eleccion = "Y"


# While que reproduce Inputs, e inserta palabras en la variable "lista2", 
# hasta que selecciones "N"
while (eleccion != "N") :
    
    stringInput = input("Introduce una palabra: ")
    lista2.append(stringInput)
    
    eleccion = input("¿Quieres seguir introduciendo palabras? (Y/N) ").upper()
    
    while (eleccion != "Y" and eleccion != "N") :
        eleccion = input("Pon Y o N: ").upper()
        


# Esta variable contiene la función devolverListaConCadenasMasLargas(), 
# que extrae la cadena (o cadenas, si tienen la misma cantidad de caracteres) 
# más "larga"
cadenasMasLargas = devolverListaConCadenasMasLargas(lista2)



# Ifs que redirigen el programa. Si la variable lista "cadenasMasLargas" 
# contiene más de 1 variable String, el programa avanzará por el primer "If". 
# Si no, irá por el "Else", mostrará la variable, y terminará el programa

if (len(cadenasMasLargas) > 1) :
    
    # Variable "listaLetrasMasFrecuentes", que usa la función 
    # extraerPalabrasMasFrecuentesDeListaDeCaracteres(), que 
    # a partir de la variable lista "cadenasMasLargas", junto con otras funciones, 
    # genera una lista con las palabras de la variable "listaLetrasMasFrecuentes", 
    # junto a la letra más frecuente y su número de apariciones en la palabra
    listaLetrasMasFrecuentes = extraerPalabrasMasFrecuentesDeListaDeCaracteres(cadenasMasLargas)
        
    
    # Print que muestra la variable "listaLetrasMasFrecuentes" para orientar
    print(f"Lista con las palabras y sus letras más frecuentes: \n{listaLetrasMasFrecuentes}\n")
    
    
    # Variable que contiene la primera mini-lista para tener una referencia, 
    # y compararla junto con las otras
    laPalabraMayor = listaLetrasMasFrecuentes[0]
   
   
    # Este "For" busca en la variable lista con listas "listaLetrasMasFrecuentes"
    # para localizar la palabra más frecuente. Si las palabras tienen la misma letra, 
    # extraerá la mayor que ellas. Si ninguna tiene la misma letra, saldrá la mini-lista 
    # de la primera posición
    for paquetito in (listaLetrasMasFrecuentes) :
        
        if ((paquetito[2] > laPalabraMayor[2])) :
            laPalabraMayor = paquetito
          
    
           
    print("*" * 50)
    print(f"De entre las palabras con el mismo número de caracteres, la palabra '{laPalabraMayor[0]}' es la palabra más larga, poseyendo la letra '{laPalabraMayor[1]}' {laPalabraMayor[2]} veces.")
        
    
    
else :
    
    print("*" * 50)
    print(f"La cadena más larga encontrada es: {cadenasMasLargas}")
      
        
        
        



