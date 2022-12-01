'''
Created on Nov 25, 2022

@author: estudiante
'''

'''1. Design a function called charactersInString 
that has a character string and a character as
input parameters and returns how many times that 
character appears in the string. It should
do if the string and character are lower case or 
upper case characters.'''

''' *********************************** '''        
''' ************ FUNCTIONS ************ '''    
''' *********************************** '''  

''' ===== Function charactersInString (character, word) ===== '''
def charactersInString (character, word) :
    
    characterFound = 0
    
    
    for letter in (word) :
        
        if (character == letter) :
            characterFound += 1 
        
    
    return (characterFound)
            
            

''' *********************************** '''        
''' ************* MAINAPP ************* '''
''' *********************************** ''' 

print(charactersInString("c", "ccchhhooocc"))







