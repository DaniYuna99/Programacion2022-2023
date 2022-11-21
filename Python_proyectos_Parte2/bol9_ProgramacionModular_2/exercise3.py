'''
Created on Nov 17, 2022

@author: estudiante
'''

'''3. Design a method called computeDaysInMonth that 
returns the number of days for the month and year 
that are received as arguments. You may use the method
leapYear above. If the values are not valid the method 
should return -1.'''


''' *********************************** '''        
''' ************ FUNCTIONS ************ '''    
''' *********************************** '''  

''' ===== Function isLeapYear (year) ===== '''  #From Exercise 2
def isLeapYear (year) :
    
    isValidAndWholesomeOneHundredPupperinoUwU = False 
    
    if ((year % 4 == 0 and year != 100) or (year % 100 != 0 and year % 400 == 0)) :
        isValidAndWholesomeOneHundredPupperinoUwU = True 
        
        
    return isValidAndWholesomeOneHundredPupperinoUwU


''' ===== Function computeDaysInMonth (month, year) ===== ''' 
def computeDaysInMonth (month, year) :
    
    listMonthName = ["January", "February", "March", "April", "May", "June", 
                     "July", "August", "September", "October", "November", "December"]
    listDaysMonth = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    
    
    if ((month <= 0 or month > 12) or (year <= 0)) :
        days = -1
        monthName = "ERROR" 
    
    else :
        
        days = listDaysMonth[month - 1]
        monthName = listMonthName[month - 1]
    

        if ((month == 2) and (isLeapYear(year) == True)) :
            days += 1
        
    
    return days, monthName



'''
AYUDA CON LOS DIAS DEL MES

Meses con 30 días: Abril, Junio, Septiembre y Noviembre.
Meses con 31 días: Enero, Marzo, Mayo, Julio, Agosto, Octubre y Diciembre.
Meses con 28 días: Febrero (Menos cuando es bisiesto que tiene 29 días).
'''    



''' *********************************** '''        
''' ************* MAINAPP ************* '''
''' *********************************** ''' 

month = int(input("Tell me the month in numbers: "))
year = int(input("Now, tell me the year: "))

days, monthName = computeDaysInMonth(month, year)


print("*" * 40)
print(f"The month {monthName} has {days} days.")






