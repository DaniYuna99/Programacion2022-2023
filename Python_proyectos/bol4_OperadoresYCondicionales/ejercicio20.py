'''
Created on 29 sept 2022

@author: Daniel
'''

'''20. Una persona adquirió un producto 
para pagar en 20 meses. El primer mes pagó 
10 €, el segundo 20 €, el tercero 40 € y así 
sucesivamente. Realizar un programa para determinar
cuánto debe pagar mensualmente y el total de lo 
que pagará después de los 20 meses.'''

pago = 10
total = pago

print(f"En el mes 1, habrá que pagar {pago} euros.")


for i in range (2, 21) :
   
    pago = pago * 2
    
    print(f"En el mes {i}, habrá que pagar {pago} euros.")
        
    total = total + pago


print("---------------------------------------------------")
print(f"La suma total de todos los pagos es {total} euros.")
    

