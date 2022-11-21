'''
Created on 3 oct 2022

@author: Daniel
'''

'''7. Design a program that asks how many 
numbers the user wants to write. After the
user enters all numbers, the program should 
say the medium of the numbers. If the
user inputs a wrong number, the program should 
ask for it again. The messages are the following:

    - “How many numbers do you want input?” to ask 
      for the number of numbers.
    - “Enter one number greater than 0:” to ask 
      for a number.
    - “The number is not valid, it should be 
      greater than 0” to inform that the number is not
      valid.
    - “The medium is XX.XX” to show the result.'''

quantity = int(input("How many number do you want to input? "))

while (quantity <= 0) :
    print("Enter a quantity greater than 0. Try again.")
    quantity = int(input("How many number do you want to input? "))
    
    
number = 1
medium = 0
        
        
for i in range (0, quantity) :
    
    if (i != (quantity + 1)) :
        
        number = int(input("Enter a number greater than 0: "))
        
        while (number <= 0) :
            print("That number is not valid. It must be greater than 0.")
            number = int(input("Enter a number greater than 0: "))
        
        medium = medium + number


print(f"The medium of the {quantity} entered numbers is {medium / quantity}.")
            
        
