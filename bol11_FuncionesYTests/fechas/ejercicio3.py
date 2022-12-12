'''
Created on Dec 12, 2022

@author: estudiante
'''

'''
3. Write a Python program to convert seconds 
to day, hour, minutes and seconds.
'''


''' *********************************** '''        
''' ************ FUNCTIONS ************ '''    
''' *********************************** '''

''' ===== Function convertSecondsToDays (secondsInput) ===== '''
def convertSecondsToDays (secondsInput) :
    
    days, hours, minutes = 0, 0, 0
    
    
    while (secondsInput >= 60) :
        
        if (secondsInput >= 60) :
            minutes += 1 
            secondsInput -= 60 
        
        if (minutes >= 60) :
            hours += 1
            minutes -= 60
        
        if (hours >= 24) :
            days += 1
            hours -= 24

    
    return (days, hours, minutes, secondsInput)



''' *********************************** '''        
''' ************* MAINAPP ************* '''    
''' *********************************** '''

assert(convertSecondsToDays(122)) == (0, 0, 2, 2)
assert(convertSecondsToDays(3667)) == (0, 1, 1, 7)
assert(convertSecondsToDays((7200 * 24) + 3800)) == (2, 1, 3, 20)
print("The tests of the function 'convertSecondsToDays()' are correct.")






