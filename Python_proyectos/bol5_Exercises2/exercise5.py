'''
Created on Oct 3, 2022

@author: estudiante
'''

'''5. Design a program that asks for numbers 
until the user inputs a negative one. When
this happens, the program will show how many 
positive numbers have been introduced by the user. 
The messages are the following:

“Enter a number (negative to finish):”
“You have entered XX positive numbers.”'''

number = int(input("Enter a number (negative to finish): "))
numCount = 0


while (number >= 0) :
    
    numCount = numCount + 1
    
    number = int(input("Enter a number (negative to finish): "))


print(f"You got out of the program. You have entered {numCount} positives numbers.")