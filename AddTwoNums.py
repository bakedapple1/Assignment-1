# This program adds 2 random integers values and retuns the result to the console

from random import randint


num1 = randint(1, 10)
num2 = randint(1, 10)

def AddTwoNums(num1, num2):
    return num1 + num2

print(str(num1) + " + " + str(num2) + " = " + str(AddTwoNums(num1, num2)))