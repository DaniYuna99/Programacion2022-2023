'''
Created on Nov 17, 2022

@author: estudiante
'''

'''4. Design a method called getDayOfWeek 
that receives a list containing three integers
(day, month and year) and returns the day of 
the week for that date (Monday, Tuesday, 
Wednesday, Thursday, Friday, Saturday, Sunday).
You can use the following algorithm to get a 
number between 0 (Sunday) and 6 (Saturday) 
corresponding to the day in the week for a 
given date:

    a = (14 - month) / 12
    y = year – a
    m = month + 12 * a – 2
    d = (day + y + y/4 - y/100 + y/400 + (31*m)/12) mod 7'''