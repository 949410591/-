if(2>1):
    print(1)
elif (1>2):
    print(2)
else:
    print(3)

a = 10
while(a>0):
    print(a)
    a-=1
else:
    print("else")

for i in range(10):
    if(i==5):
         break
    print(i)
else:
    print("else")


try:
    print("try")

    raise IndentationError("hanhan")
except IndentationError as reason :
    print(reason)

else:
    print("else")

finally:
    print("finally")