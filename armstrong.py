
num = int(input())
l = len(str(num))
temp = num
t=0
while temp > 0:
    d = temp % 10
    t = t + d ** l
    temp = temp // 10
if(t == num):
    print("Armstrong")
else:
    print("Not armstrong")