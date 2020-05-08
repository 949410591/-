import keyword

# userInput = input()
# print(userInput)
#
# print("这是用户输入")
#
# print(userInput,end= "")
#
# print("这是用户输入")
import random

print(dir())
print(dir(object))



help("keywords")


print(keyword.kwlist)



a = 1
b = 2
c = 3
print(a,b,c)

print(type(a))
print(isinstance(a,int))

print(isinstance(True,int))


print(min(1,3,4,3,5,12,5))
print(max(1,2,3,4,5,6,7,1,123123,12321))

print(pow(2,4))
print(abs(-123123123))

print()
print(123)
print(bin(123))
print(oct(123))
print(hex(123))


print(random.random())
for i in range(10) :
    print(i)


a = [1,23,12312,4,5,123123]
for i in a:
    print(i)

print(a)
print(tuple(a))

a = tuple(a)

print(list(a))

print(str(a))


print(sorted(a))
print(len(a))
print(max(a))
print(min(a))


print(reversed(a))
print(a)



print(list(reversed(a)))



print(sum(a))
print(list(zip(a,a)))

print(list(zip(a,a[0:-2])))

print(list(enumerate(a)))
print(123)
print("123"+"123")
print()
a = 'B'+"123"
print(a)


