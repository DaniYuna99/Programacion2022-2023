'''
Created on Sep 26, 2022

@author: estudiante
'''

'''9. En un establecimiento en rebajas, hay 3 tipos 
de productos (A, B y C). El porcentaje de rebaja que 
se aplicará sobre el precio original del producto se
calcula de la siguiente forma:

    - Si el producto es de tipo A, independientemente de su precio se
    aplica un 7% de descuento.
    
    - Si el producto es de tipo C o bien el precio es inferior a 500€ se
    aplicará un porcentaje del 12% de descuento.
    
    - En el resto de casos se aplica un 9% de descuento.
    
Realizar un programa que solicite los datos necesarios (tipo de producto y
precio original) y calcule el precio rebajado. Debe comprobarse que los
datos de entrada son correctos, y si no lo son mostrar un mensaje de error.'''


tipoProducto = str(input("Dime el tipo de producto (A, B o C): "))
tipoProducto = tipoProducto.upper()
precio = int(input("Dime el precio del producto: "))


if (tipoProducto == "A" or tipoProducto == "B" or tipoProducto == "C") :
    
    if (precio > 0) :
        
        if (tipoProducto == "A") :
            print(f"Se le aplica un 7% de descuento. El producto costará {precio * 0.93} euros.")
            
        elif (tipoProducto == "C" or precio < 500) :
            print(f"Se le aplica un 12% de descuento. El producto costará {precio * 0.88} euros.") 
  
        else :
            print(f"Se le aplica un 9% de descuento. El producto costará {precio * 0.91} euros.")

    else :
        print("El precio es cero o negativo. Inténtalo de nuevo.")
        
else :
    print("El tipo de producto es erróneo. Inténtalo de nuevo.")










