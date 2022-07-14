# class Solution:
#     def isPalindrome(self, x):
#         if x < 0:
#             return False
#         elif x == 0:
#             return True
#         else:
#             x_str = str(x)
#             str = ""
#             i = len(x_str)
#             while i >= 0:
#                 str += x_str[i]
#             if int(str) == x:
#                 return True
#         return False



def checker(x):
    if x < 0:
        return False
    elif x == 0:
        return True
    else:
        x_str = str(x)
        string = ""
        i = len(x_str) - 1
        while i >= 0:
            string += x_str[i]
            i -= 1
        if int(string) == x:
            return True
    return False

print(checker(123456789876554321))