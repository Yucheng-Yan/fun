import string
def print_rangoli(size):
    alphabet = string.ascii_lowercase
    ls = []
    for i in range(size):
        s = '-'.join(alphabet[i:size])
        ls.append((s[::-1] + s[1:]).center(4*size-3, "-"))
    print('\n'.join(ls[:0:-1] + ls))

if __name__ == '__main__':
    n = int(input())
    print_rangoli(n)
    
    

# import string
# alpha = string.ascii_lowercase
# n = int(input())
# L = []
# for i in range(n):
#     s = "-".join(alpha[i:n])
#     # print(">>>s = ", s)
#     # # print(">>>L = ", L)
#     # # print("s[::-1] =", s[::-1])
#     # # print("s[1:] = ", s[1:])
#     # # print("L[:0:-1]+L = ", L[:0:-1]+L)
#     L.append((s[::-1]+s[1:]).center(4*n-3, "-"))
# print('\n'.join(L[:0:-1]+L))
