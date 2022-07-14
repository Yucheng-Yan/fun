import itertools

a = input()
b = input()
a = a.split()
b = b.split()
lsa = []
lsb = []
for num in a:
    lsa.append(int(num))
for num in b:
    lsb.append(int(num))
result = itertools.product(lsa,lsb)
for num in result:
    print(num, end=" ")