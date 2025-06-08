from cmath import sqrt
a = int(input("coefficient of a:"))
b = int(input("coefficient of b:"))
c = int(input("coefficient of c:"))

d = b**2 - 4*a*c
root1 = (-b + sqrt(d))/(2*a)
root2 = (-b - sqrt(d))/(2*a)
print("Root1: ",root1)
print("Root2: ",root2)