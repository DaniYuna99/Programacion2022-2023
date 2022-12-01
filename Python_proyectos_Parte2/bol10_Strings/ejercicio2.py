'''
Created on Nov 25, 2022

@author: estudiante
'''

'''2. Design a function called lowCaseInString 
that has a string of characters as parameter, the
method should return how many of those characters 
are lowcase letters.'''


''' *********************************** '''        
''' ************ FUNCTIONS ************ '''    
''' *********************************** '''  

''' ===== Function lowCaseInString (word) ===== '''
def lowCaseInString (word) :
    
    charactersThatAreLowercase = 0 
    
    
    for letter in (word) :
        
        if (letter == letter.lower()) :
            charactersThatAreLowercase += 1 
        
    
    return (charactersThatAreLowercase)



''' *********************************** '''        
''' ************* MAINAPP ************* '''
''' *********************************** ''' 

print(lowCaseInString("ccccUACc"))       #5
print(lowCaseInString("jaJajaAJAJjaja")) #9




