'''
Created on Oct 4, 2022

@author: estudiante
'''

'''10. Design a program that reads an integer positive number and says the “factorial” of
the number. To calculate the factorial you should know that
    FACT(0) = 1
    FACT(1) = 1
    FACT(N) = N*(N-1)*(N-2)*....1
    
The messages are the following:
    - “Enter an integer positive number:”
    - “The number is not valid, try again.”
    - “The factorial is XX”'''
    
number = int(input("Enter an integer positive number: "))

while (number < 0) :
    print("The number is not valid, try again.")
    number = int(input("Enter an integer positive number: "))


factorial = number


if (number == 0) :
    factorial = 1
    
else :
    for i in range (1, number) :
        factorial = factorial * (number - i)
   

print("*" * 30) 
print(f"The factorial of {number} is {factorial}.")