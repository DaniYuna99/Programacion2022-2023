'''
Created on Oct 3, 2022

@author: estudiante
'''

'''1. Design a program to show all numbers between 
1 and 100. If the number is a multiple of 7 you 
should show the message "The number xx is a multiple 
of 7". If the number is a multiple of 13 you should 
show the message "The number xx is a multiple of 13". 
If the number is a multiple of 7 and 13 you should show both
messages.'''

for i in range (1, 101) :
    
    print(i)

    if (i % 7 == 0) :
        print(f"{i} is a multiple of 7.")
    
    if (i % 13 == 0) :
        print(f"{i} is a multiple of 13.")
