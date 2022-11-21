'''
Created on Sep 27, 2022

@author: estudiante
'''

'''8. Diseñar un algoritmo que nos 
diga el dinero que tenemos (en euros y céntimos) 
después de pedirnos cuantas monedas tenemos de 
2e, 1e, 50 céntimos, 20 céntimos o 10 céntimos).'''

dosEuros = int(input("¿Cuántas monedas de 2 euros tienes? "))
unEuro = int(input("¿Cuántas monedas de 1 euro tienes? "))
cincuentaCent = int(input("¿Cuántas monedas de 50 céntimos tienes? "))
veinteCent = int(input("¿Cuántas monedas de 20 céntimos tienes? "))
diezCent = int(input("¿Cuántas monedas de 10 céntimos tienes? "))
cincoCent = int(input("¿Cuántas monedas de 5 céntimos tienes? "))
dosCent = int(input("¿Cuántas monedas de 2 céntimos tienes? "))
unCent = int(input("¿Cuántas monedas de 1 céntimo tienes? "))

total = ((dosEuros * 2.00) + (unEuro * 1.00) + (cincuentaCent * 0.50) + 
         (veinteCent * 0.20) + (diezCent * 0.10) + (cincoCent * 0.05) + 
         (dosCent * 0.02) + (unCent * 0.01))

print(f"Tienes un total de {total} euros en monedas.")