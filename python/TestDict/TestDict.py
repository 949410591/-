a = {"a":1,"b":2}
print(a)

a = dict([[1,2],[3,4],[5,6],[7,8]])
print(a)

b = [1,2,3,4,5,6]
a = dict(zip(b,b))
print(a)

a = dict(enumerate(b))
print(a)


a = dict(a = 1,b=2,c=3)
print(a)

print(dir(a))


a["d"] = 4
print(a)
del a['d']
print(a)

a["a"]=5
print(a)

a.clear()
print(a)

a = dict(a = 1,b=2,c=3)
print(a.pop("a"))
print(a)


print(a["b"])
print(a.get("b"))

a = dict(a = 1,b=2,c=3)
print(a.popitem())
print(a)

a = dict(a = 1,b=2,c=3)
print(a.keys())
print(a.items())
print(a.values())

print(dir(a))

print(a.fromkeys([1,2,3,4],1))

print(a.setdefault("b",0))
print(a)
a.update([["a",0],["b",0],["c",0],["d",123]])
print(a)

b = [1,2,3,4]
a.update(enumerate(b))
print(a)
a.update(zip(b,b))
print(a)

print("a" in a)
a.__contains__()

print(0 in a)
