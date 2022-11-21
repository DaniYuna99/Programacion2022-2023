'''
Created on Oct 20, 2022

@author: estudiante
'''

'''6. Design a program that reads two integer numbers, for example numberA and
numberB, and calculates the product of both numbers without use multiplication, but
using the sum. The messages are the following:

“Enter one number:”
“The product is XX”'''


numberA, numberB = int(input("Enter one number: ")), int(input("Enter a second number: "))
total = 0


for i in range (abs(numberB)) :
    total = total + numberA


if (numberA < 0) :
    total = -total 
    

print(f"The product of {numberA} and {numberB} is {total}.")