a = 1,3,4,2,5,6
print(a)
a = (1)
print(a)
a = (1,)
print(a)

a = a + (1,2,3,4,5)
print(a)

a = a[:1] + a[2:]
print(a)

a = a + ([12312312312],)
a[-1][0] = 1
print(a)


print(a.count(1))
print(a.index(1))

print([1,2,3]+[1,3,4])
print("123"+"123"+"12312")
print((123123,123,123123)+(1,3,12,1,)+(1,2,2,3))
