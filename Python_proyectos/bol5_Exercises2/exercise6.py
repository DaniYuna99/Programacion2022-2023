'''
Created on 3 oct 2022

@author: Daniel
'''

'''6. Design a program that reads two integer numbers, for example numberA and
numberB, and calculates the product of both numbers without use multiplication, but
using the sum. The messages are the following:

“Enter one number:”
“The product is XX”'''

numberA, numberB = int(input("Enter one number: ")), int(input("Enter a second number: "))
total = 0
ambosNegativos = False
numberB

if (numberA < 0 and numberB < 0) :
    numberA = -numberA 
    numberB = -numberB
    ambosNegativos = True


for i in range (0, numberB) :
    total = total + numberA


if (ambosNegativos == True and numberB % 2 == 0) :
    numberA = -numberA 
    numberB = -numberB

elif (ambosNegativos == True and numberB % 2 == 1) :
    numberA = -numberA 
    numberB = -numberB
    total = -total
    
    
print(f"The product of {numberA} and {numberB} is {total}.")






