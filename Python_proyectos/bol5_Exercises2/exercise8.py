'''
Created on 3 oct 2022

@author: Daniel
'''

'''8. Design a program that asks for a set of 
numbers. After inputting each number, the
program should ask “Do you want to enter 
more numbers (Y/N)?”. If the answer is “Y”
the program asks for other numbers. When 
the user finishes to enter all the numbers,
the program should say which one is the 
smallest. The messages are the following:

    - “Enter one number:”
    - “Do you want to enter more number (Y/N)?”
    - “The smallest number is XX”'''

number = int(input("Enter one number: "))
smallest = number
greatest = number

answer = str(input("Do you want to enter more number (Y / Any key minus Y for No)? "))
answer = answer.upper()
    
    
while (answer.upper() == "Y") :
   
    number = int(input("Enter one number: "))
    
    if (number < smallest) :
        smallest = number 
    
    elif (number > greatest) :
        greatest = number
    
    answer = str(input("Do you want to enter more number (Y/N)? "))
    
    
    
print("\n")   
print("*" * 30)
print("You got out of the program.")
print(f"The smallest number is {smallest}, and the greatest is {greatest}.")



    
    