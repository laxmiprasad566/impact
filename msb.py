n=int(input(":"))
b=int(input())
msb=0
while (n>1):
    n=n>>1
    msb=msb+1
if(msb == b):
    print("true")
else:
    print("false")