from math import sqrt

x = int(input("Enter x: "))
y = int(input("Enter y: "))
a = int(input("Enter a: "))
b = int(input("Enter b: "))

d = sqrt((a - x)**2 + (b - y)**2)
print("Distance:", d)
