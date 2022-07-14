#from collections import Counter

# num_of_shoes = int(input())
# ls_of_shoes = input().split()
# num_of_customers = int(input())
# while i < num_of_customers:
    
#     i += 1

import collections

numShoes = int(input())
shoes = collections.Counter(map(int, input().split()))
print(">>>shoes = ", shoes)
numCust = int(input())

income = 0

for i in range(numCust):
    size, price = map(int, input().split())
    if shoes[size]: 
        print(">>>shoes[size] = ", shoes[size])
        income += price
        shoes[size] -= 1

print(income)

# #test
# ls = [1, 1, 2, 3, 3, 3, 4, 5]
# print(Counter(ls))
# print(Counter(ls).items())
# print(Counter(ls).keys())
# print(Counter(ls).values())