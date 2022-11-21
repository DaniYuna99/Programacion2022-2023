'''
Created on Oct 4, 2022

@author: estudiante
'''

'''9. Design a program that reads an integer positive 
number greater than 0 and says if it’s a “perfect number”. 
A number is perfect if it is equal to the sum of all its 
divisors. The messages are the following:

    - “Enter an integer positive number greater than 0:”
    - “The number is not valid, try again.”
    - “The number is perfect.”
    - “The number is not perfect.”'''

divisorsSum = 0
number = int(input("Enter a positive integer number greater than 0: "))

while (number < 0) :
    print("Wrong. Enter a positive integer number, not whatever you put in the first place: ")
    number = int(input("Enter: "))
    

for i in range (1, ((number // 2) + 1)) :
    
    if (number % i == 0) :
        divisorsSum = divisorsSum + i
    
    
if (divisorsSum == number) :
    print(f"The number {number} is perfect.")

else :
    print(f"The number {number} is not perfect.")
    
    
    