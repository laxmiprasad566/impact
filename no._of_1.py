d = int(input("dec: "))
if (d == 0):
    print("0")
else:
    i=0
    n = d
    o=""
    while (n>0):
        o = str(n%2)
        if (i==1):
            i=i+1
        n=n//2
print(i)