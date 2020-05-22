def test(a,b,c):
    print(a,b,c)
test(1,2,3)

def ponly_paremeter(a,/):
    print(a)
ponly_paremeter(1)


def konly_paremeter(*,a):
    print(a)
konly_paremeter(a = 1)


def k_or_p_paremeter1(a,/,b,c,*,d):
    print(a,b)
k_or_p_paremeter1(1,2,c=3,d=4)

def k_or_p_paremeter2(a,b):
    print(a,b)
k_or_p_paremeter2(1,b =2)

def f(arg=1):
    print(arg)
f()
f(arg=123)

def f(a,b=1):
    print(a,b)
f(a=1)


def f(*a):
    print(a)
f(1)
f(2,3)
f(1,2,3)








