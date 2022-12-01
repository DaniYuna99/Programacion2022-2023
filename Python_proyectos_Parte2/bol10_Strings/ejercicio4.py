'''
Created on Nov 25, 2022

@author: estudiante
'''

''' 4. Design a function called numberInString 
that has a string of characters as parameter, the
method should return how many of those characters 
are numbers.'''


''' *********************************** '''        
''' ************ FUNCTIONS ************ '''    
''' *********************************** '''  

''' ===== Function numberInString (word) ===== '''
def numberInString (word) :
    
    numbersInWord = 0 
    
    
    for letter in (word) :
        
        if (letter.isdigit()) :
            numbersInWord += 1
    
    
    return (numbersInWord)



''' *********************************** '''        
''' ************* MAINAPP ************* '''
''' *********************************** ''' 

print(numberInString("54adr67"))   # 4
print(numberInString("454545t45")) # 8





