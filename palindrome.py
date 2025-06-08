num=int(input(":"))
l = len(str(num))
v=num
rev=0
for i in range (l):
    n = v%10
    rev=rev*10+n
    v = v//10
if (num == rev):
    print("Palindrome")
else:
    print("Not palindrome")
