
import math
import os
import random
import re
import sys

# Complete the solve function below.
# def solve(s):
#     name = s.split()
#     ls = []
#     for na in name:
#         if na[0].isdigit():
#             ls.append(na)
#         elif na[0].isupper():
#             na = na.capitalize()
#             ls.append(na)
#         elif na[0].islower():
#             na = na.capitalize()
#             ls.append(na)
#     result = " ".join(ls[:])
#     return result

def solve(s):
    for x in s[:].split():
        s = s.replace(x, x.capitalize())
    return s

if __name__ == '__main__':
    s = input()
    print(solve(s))

