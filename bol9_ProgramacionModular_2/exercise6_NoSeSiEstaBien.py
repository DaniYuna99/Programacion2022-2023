'''
Created on Nov 17, 2022

@author: estudiante
'''

'''6. Design a method called getNumberOfDigits 
that receives one number (it can be real, 
integer, positive or negative) and should 
return the number of digits it contains. If
the parameter is not valid the method should 
return None. Extend this function to
other numeric systems (hexadecimal, decimal, 
binary, octal).'''


''' *********************************** '''        
''' ************ FUNCTIONS ************ '''    
''' *********************************** '''  

''' ===== Function getNumberOfDigits (number) ===== '''
def getNumberOfDigits (number) :
    
    if (type(number) == int or type(number) == float or type(number) == str
        and len(str(number)) != 0) :
        
        number = str(number).upper()
        numberOfDigits = 0
        notValid = False
    
    
        for i in (number) :
            
            if (i.isdigit() or (i in ["A","B","C","D","E","F"]) and notValid == False) :
                numberOfDigits += 1
            
            elif (i not in ["A","B","C","D","E","F"] and i != "-" and i != ".") :
                notValid = True
                numberOfDigits = None
            
            
    else :
        numberOfDigits = None
        
        
    return (numberOfDigits)



''' *********************************** '''        
''' ************* MAINAPP ************* '''
''' *********************************** ''' 

print(getNumberOfDigits(1010101))
print(getNumberOfDigits(-1010101))
print(getNumberOfDigits(-1010.2345))
print(getNumberOfDigits("fadf1023"))
print(getNumberOfDigits("10101010"))
print(getNumberOfDigits("444H"))





