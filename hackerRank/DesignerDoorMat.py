# Enter your code here. Read input from STDIN. Print output to STDOUT
N, M = input().split()
N = int(N)
M = int(M)
i = 1
k = 1
while i < N:
    print(str(".|."*i).center(M, "-"))
    i += 2
    k += 1
    if k == N//2 + 1:
        print("WELCOME".center(M, "-"))
        i += 2
i -= 4
while i > 0:
    print(str(".|."*i).center(M, "-"))
    i -= 2