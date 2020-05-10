
a = [i for i in range(10)]
print(a)
a =[]
for i in range(10):
    a.append(i)
print(a)



a = [[] for i in range(10)]
print(a)
a =[]

for i in range(10):
    a.append([])
print(a)



a = [[j for j in range(10)] for i in range(10)]
print(a)

a =[]
b = [[1,2,3],
     [4,5,6],
     [7,8,9]]
a = [[ j[i] for j in b] for i in range(3)]
print(a)

a = []
for i in range(3):
    a.append([])
    for j in b:
        a[i].append(j[i])
print(a==[[ j[i] for j in b] for i in range(3)])


a = {i for i in range(10)}
print(a)
print(type(a))

a = {i:i for i in range(10)}
print(a)
b = [
    ["a",1],
    ["b",2],
    ["c",3]
]
a = {x:y for x,y in b}
print(a)

print()
a = (i for i in range(10))
print(tuple(a))






