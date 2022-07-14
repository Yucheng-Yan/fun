if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())

ls = list(arr)   
i = 0
j = ls[0]
while i < n:
    if j <= ls[i]:
        j = ls[i]
    i += 1

while j in ls:
    ls.remove(j)
    
i = 0
j = ls[0]
while i < len(ls):
    if j <= ls[i]:
        j = ls[i]
    i += 1
print(j)
