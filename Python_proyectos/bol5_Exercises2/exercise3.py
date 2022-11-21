'''
Created on Oct 3, 2022

@author: estudiante
'''

'''3. Design a program that asks how many numbers 
the user wants to introduce. Then, the user would 
have to introduce the numbers one by one and the 
program should say if each one of the numbers 
is odd or even. If the user inputs 0 or a negative
number, it is not valid, and the system should ask 
for another number. The messages are the following:

    - “How many numbers do you want input?” to ask for the number of numbers.
    - “Enter one number greater than 0:” to ask for a number.
    - “The number is not valid, it should be greater than 0” to inform that the number is not
       valid.
    - “The number XX is odd”
    - “The number XX is even”'''

quantity = int(input("How many number do you want to input? "))

while (quantity <= 0) :
    print("Enter a quantity greater than 0. Try again.")
    quantity = int(input("How many number do you want to input? "))
        
        
for i in range (quantity) :
    
    number = int(input("Enter a number greater than 0: "))
        
    while (number <= 0) :
        print("That number is not valid. It must be greater than 0.")
        number = int(input("Enter a number: "))
            
            
    if (number % 2 == 0) :
        print(f"{number} is even.")
    
    else :
        print(f"{number} is odd.")


    
    
    
        

    







