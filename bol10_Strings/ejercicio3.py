'''
Created on Nov 25, 2022

@author: estudiante
'''

'''3. Design a function called upperCaseInString 
that has a string of characters as parameter, the
method should return how many of those characters 
are upper case letters.'''


''' *********************************** '''        
''' ************ FUNCTIONS ************ '''    
''' *********************************** '''  

''' ===== Function upperCaseInString (word) ===== '''
def upperCaseInString (word) :
    
    charactersThatAreUppercase = 0 
    
    
    for letter in (word) :
        
        if (letter == letter.upper()) :
            charactersThatAreUppercase += 1 
        
    
    return (charactersThatAreUppercase)



''' *********************************** '''        
''' ************* MAINAPP ************* '''
''' *********************************** ''' 

print(upperCaseInString("IaUfGc"))       #3
print(upperCaseInString("UAUAUAaaa"))    #6















