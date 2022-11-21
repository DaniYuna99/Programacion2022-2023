'''
Created on Sep 22, 2022

@author: estudiante
'''

'''
2. Escribir una expresión lógica que cumpla:

    a) Debe ser Falsa si alguna de las calificaciones contenidas en 
    las variables reales nota1, nota2 y nota3 es un suspenso.
    
    b) Debe ser Falsa si la persona no es un usuario fiable, esto 
    ocurrirá cuando tenga menos de 1000 euros en la variable saldo 
    o se haya quedado al descubierto más de 5 veces. Este
    último dato se almacenará en la variable descubierto.
    
    c) Debe ser Falsa cuando el valor almacenado en la variable 
    asignaturasAprobadas sea inferior al 30% del valor almacenado 
    en la variable asignaturasCurso.
    
    d) Debe ser Falsa si los números contenido en las variables 
    enteras mes y día no son válidos. Vamos a considerar que no 
    hay años bisiestos.
    
        NOTA: Además siempre debe ser Verdadera en el caso contrario al que se formula.
'''


'''========== A) =========='''

print("APARTADO A")


#False
nota1 = 6
nota2 = 5
nota3 = 5

print(not ((nota1 + nota2 + nota3) / 3) > 5)


#True
nota1 = 4
nota2 = 3
nota3 = 6

print(not ((nota1 + nota2 + nota3) / 3) > 5)



'''========== B) =========='''

print("-----------")
print("APARTADO B")


#False
saldo = 300
descubierto = 6

print(not (saldo < 1000 or descubierto > 5))


#True
saldo = 1001
descubierto = 4

print(not (saldo < 1000 or descubierto > 5))


#False
saldo = 900
descubierto = 3

print(not (saldo < 1000 or descubierto > 5))


#False
saldo = 3900
descubierto = 7

print(not (saldo < 1000 or descubierto > 5))



'''========== C) =========='''

print("-----------")
print("APARTADO C")


#True
asignaturasAprobadas = 5
asignaturasCurso = 10

print(asignaturasAprobadas >= asignaturasCurso * 0.30)


#False
asignaturasAprobadas = 2
asignaturasCurso = 10

print(asignaturasAprobadas >= asignaturasCurso * 0.30)



'''========== D) =========='''

print("-----------")
print("APARTADO D")

mes = 1
dia = 31


if (((mes == 1 or mes == 3 or mes == 5 
     or mes == 7 or mes == 8 or mes == 10
     or mes == 12) and dia <= 31) or 
     ((mes == 4 or mes == 6 or mes == 9 
     or mes == 11) and dia <= 30) or 
     (mes == 2) and dia <= 28) :
    print(True)

else : 
    print(False)












