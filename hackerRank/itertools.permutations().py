import itertools

income = input().split()
string = income[0]
size = int(income[1])

for item in itertools.permutations(string, size):
    print(str(item))