'''
Created on Oct 3, 2022

@author: estudiante
'''

'''2. Design a program for reading an integer between 
0 and 10 and show the times table. To ask for the 
number you should show the next message "Enter one number
between 0 and 10”. If the number is out of the boundaries, 
the program should show the message “The number is out 
of the boundaries”. If the number is valid, it should
show the times table following the next format:

7*0=0
7*1=7
.....
7*10=70'''

number = int(input("Enter one number between 0 and 10: "))


while (number < 0 or number > 10) :
    print("The number is out of the boundaries. Try again.")
    number = int(input("Enter one number between 0 and 10: "))


loop = 0


for i in range (0, ((number * 10) + 1), number) :
    print(f"{number} x {loop} = {i}")
    loop = loop + 1
    
    
    
    
    
    
    
    
    
    