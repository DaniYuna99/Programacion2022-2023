'''
Created on 27 sept 2022

@author: Daniel
'''

'''12. La asociación de vinicultores tiene como 
política fijar un precio inicial al kilo de uva, la cual
se clasifica en tipos A y B, y además en tamaños 1 y 2. 
Cuando se realiza la venta del producto, ésta es de un 
solo tipo y tamaño, se requiere determinar cuánto recibirá 
un productor por la uva que entrega en un embarque, 
considerando lo siguiente: si es de tipo A, se le cargan 
20 céntimos al precio inicial cuando es de tamaño 1; y 
30 céntimos si es de tamaño 2. Si es de tipo B, se 
rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos
cuando es de tamaño 2. Realice un algoritmo para 
determinar la ganancia obtenida.'''

precio = float(input("¿Cuántos euros de uvas quieres comprar? "))
tipoUva = str(input("Dime el tipo de uva que deseas comprar (A/B): "))
tipoUva = tipoUva.upper()
tamanoUva = int(input("¿Tamaño de las uvas a comprar? (1/2): "))
total = 0


if (tipoUva == "A") :
    
    if (tamanoUva == 1) :
        total = (precio + 0.20)
    
    elif (tamanoUva == 2) :
        total = (precio + 0.30)
    
elif (tipoUva == "B") :
    
    if (tamanoUva == 1 and precio >= 0.30) :
        total = (precio - 0.30)
        
    else :
        total = 0
    
    
    if (tamanoUva == 2 and precio >= 0.50) :
        total = (precio - 0.50)
        
    else :
        total = 0
    

print(f"El precio final con la rebaja aplicada correspondiente es {total} euros.")







