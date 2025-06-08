num = int(input())
i = (num//2)+1
for d in range (1,int(i)):
    j = num % d
    if j == 0:
        print(d)