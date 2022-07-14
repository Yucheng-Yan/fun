# def print_formatted(number):
#     width = len(bin(number)) - 2
#     i = 1
    
#     while i <= number:
#         print("{0:>{width}d} {0:>{width}o} {0:>{width}X} {0:>{width}b}".format(int(i), width = width))
#         i += 1
    
# if __name__ == '__main__':
#     n = int(input())
#     print_formatted(n)
    
#test
i = int(input())
# print("{:>{width}d} {:>{width}} {:>{width}} {:>{width}}".format(int(i), int(i),int(i),int(i),width = 1))

print("{0:0>{width}d} {0:0>{width}} {0:0>{width}} {0:0>{width}}".format(int(i) ,width = 5))