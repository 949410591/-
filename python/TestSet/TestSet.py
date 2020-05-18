a = {}
print(type(a))
a =set()
print(type(a))

a = [123123123123123,1,2,3,4,5,312312,12312,12312312312312,12312312312312312312]
a = set(a)
print(a)



print(dir(a))

a.add(6)
print(a)
a.remove(6)
print(a)

a = frozenset(a)
print(a)
a = [123123123123123,1,2,3,4,5,312312,12312,12312312312312,12312312312312312312]
a = set(a)
print(a.pop())
print(a)

a.clear()
print(a)
a.update([123,123,13,4,5,6,7])
print(a)
a.update([10,11,12])
print(a)
a.discard(4)
print(a)
a.discard(4)
print("aset",a)
print(id(a))
b = a.union()
print("bset",b)
print(id(b))
c = a.copy()
print("cset",c)
print(id(c))

print(dir(a))

print(a)
print(5 in a)


