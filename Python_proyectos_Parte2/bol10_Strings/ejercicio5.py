'''
Created on Nov 25, 2022

@author: estudiante
'''

''''5. Design a function called palindrome that has 
a string of characters as parameter, and return
true if it is a palindrome or false in other 
case. A word is a palindrome, if it is reads the
same from left to right as from right to left, 
ignoring whites,. For example: "anilina" or "el
abad le dio arroz al zorro" To simplify the problem, 
you can assume that simple characters
are used, that is, without tildes or diresis.'''


''' *********************************** '''        
''' ************ FUNCTIONS ************ '''    
''' *********************************** '''  

''' ===== Function palindrome (word) ===== '''
def palindrome (word) :
    
    reverseWord = ""
    word = word.replace(" ", "").lower()
    
    
    for letter in reversed (word) :
        reverseWord += letter 
        
    
    return (word == reverseWord)



''' *********************************** '''        
''' ************* MAINAPP ************* '''
''' *********************************** ''' 

print(palindrome("girAfarig"))
print(palindrome("anilina"))
print(palindrome("werwr"))
print(palindrome("A luna ese Anula"))


