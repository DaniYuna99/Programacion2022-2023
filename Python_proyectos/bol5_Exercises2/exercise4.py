'''
Created on Oct 3, 2022

@author: estudiante
'''

'''4. Design a program that reads a positive number 
N greater than 0 and show the result of the sum of 
the N numbers between 1 and N. If the number N is 
not valid, the program should ask for it again. 
The messages are the following:

“Enter one number greater than 0:”
“The number is not right, try again.”
“The sum of the N first numbers is XX.”'''

number = int(input("Input a number greater than 0, and I will show you the sum of its predecessors: "))

while (number <= 0) :
    print("The number mustn't be a negative one or zero. Try again.")
    number = int(input("Input again: "))
    
sum1 = 0
    
for i in range (number, 0, -1) :
    sum1 = sum1 + i 

''' PARA CREAR SEPARACIÓN ENTRE TEXTO EN LA CONSOLA '''
print("\n" * 15)

''' PARA CREAR BARRAS DE SEPARACIÓN DE FORMA RÁPIDA '''
print("*" * 30)


print(f"The sum of all the number before {number} plus itself ({number} + {number - 1}...) is {sum1}.")





