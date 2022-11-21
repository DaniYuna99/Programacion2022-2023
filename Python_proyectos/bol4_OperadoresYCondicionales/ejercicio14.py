'''
Created on Sep 29, 2022

@author: estudiante
'''

'''14. La política de cobro de una compañía telefónica 
es: cuando se realiza una llamada, el cobro es por el 
tiempo que ésta dura, de tal forma que los primeros 
cinco minutos cuestan 1 euro, los siguientes tres, 
80 céntimos, los siguientes dos minutos, 70 céntimos, 
y a partir del décimo minuto, 50 céntimos. Además, se 
carga un impuesto de 3 % cuando es domingo, y si es otro 
día, en turno de mañana, 15 %, y en turno de tarde, 10 %. 
Realice un algoritmo para determinar cuánto debe pagar 
por cada concepto una persona que realiza una llamada.'''

tiempo = int(input("¿Cuántos minutos duró la llamada? "))

diaSemana = str(input("¿Qué día de la semana fue cuándo hiciste la llamada? (L,M,X,J,V,S,D) "))
diaSemana = diaSemana.upper()

turno = str(input("¿Qué turno era? (Mañana (M) o Tarde (T)) "))
turno = turno.upper()

total = 0


#Cálculo del coste total de la llamada
if (tiempo <= 5) :
    total = 1 * tiempo

elif (tiempo > 5 and tiempo <= 8) :
    total = 5.00 + (0.80 * (tiempo - 5)) 

elif (tiempo > 8 and tiempo <= 10) :
    total = 7.40 + (0.70 * (tiempo - 8))

elif (tiempo > 10) :
    total = 8.80 + (0.50 * (tiempo - 10))


#Carga de impuestos
if (diaSemana == "D") :
    total = total * 1.03

elif (diaSemana != "D" and turno == "M") :
    total = total * 1.15

elif (diaSemana != "D" and turno == "T") :
    total = total * 1.10


print(total)


    