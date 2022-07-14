# vowels_ls = ['A', 'E', 'I', 'O', 'U']

# def stuart_score_calculator(ls) -> int:
#     score = 0
#     for item in ls:
#         if item[0] not in vowels_ls:
#             score += 1
#     return score
    
# def kevin_score_calculator(ls) -> int:
#     score = 0
#     for item in ls:
#         if item[0] in vowels_ls:
#             score += 1
#     return score

# def combination_generator(string) -> list:
#     ls = []
#     i = 0
#     while i < len(string):
#         k = i
#         while k <= len(string):
#             #print("string[i:k] = " + string[i:k])
#             ls.append(string[i:k])
#             k += 1
#         i += 1
#     for item in ls:
#         if not item:
#             ls.remove(item)
#     return ls
    

# def minion_game(string):
#     ls = combination_generator(string)
#     if stuart_score_calculator(ls) > kevin_score_calculator(ls):
#         print("Stuart", stuart_score_calculator(ls))
#         return None 
#     elif stuart_score_calculator(ls) < kevin_score_calculator(ls):
#         print("Kevin", kevin_score_calculator(ls))
#         return None 
#     else:
#         print("Draw")
    

# if __name__ == '__main__':
#     s = input()
#     minion_game(s)
    
    
#test
# def combination_generator(string) -> list:
#     ls = []
#     i = 0
#     while i < len(string):
#         k = i
#         while k <= len(string):
#             print("string[i:k] = " + string[i:k])
#             ls.append(string[i:k])
#             k += 1
#         i += 1
#     return ls

# def kevin_score_calculator(string) -> int:
#     score = 0
#     for alpha in string:
#         if alpha in vowels_ls:
#             score += 1
#     return score

# print(combination_generator("banana"))

#V2
# def minion_game(string):
#     vowels_ls = ['A', 'E', 'I', 'O', 'U']
#     stuart_score = 0
#     kevin_score = 0
#     i = 0
#     while i < len(string):
#         k = i
#         while k <= len(string):
#             #print("string[i:k] = " + string[i:k])
#             if string[i:k]:
#                 if string[i:k][0] in vowels_ls:
#                     kevin_score += 1
#                 else:
#                     stuart_score += 1
#                 k += 1
#             else:
#                 k += 1 
#         i += 1
#     if stuart_score > kevin_score:
#         print("Stuart", stuart_score)
#         return None 
#     elif stuart_score < kevin_score:
#         print("Kevin", kevin_score)
#         return None 
#     else:
#         print("Draw")
    

# if __name__ == '__main__':
#     s = input()
#     minion_game(s)
    
#V3
# def minion_game(string):
#     vowels_ls = ['A', 'E', 'I', 'O', 'U']
#     stuart_score = 0
#     kevin_score = 0
#     i = 0
#     while i < len(string):
#         k = i
#         while k <= len(string):
#             if string[i:k]:
#                 if string[i:k][0] in vowels_ls:
#                     kevin_score += 1
#                 else:
#                     stuart_score += 1
#             k += 1
#         i += 1
        
#     if stuart_score > kevin_score:
#         print("Stuart", stuart_score)
#         return None 
#     elif stuart_score < kevin_score:
#         print("Kevin", kevin_score)
#         return None 
#     else:
#         print("Draw")
    

# if __name__ == '__main__':
#     s = input()
#     minion_game(s)
    
# from discussion
def minion_game(s):
    vowels = 'AEIOU'
    kevsc = 0
    stusc = 0
    for i in range(len(s)):
        if s[i] in vowels:
            kevsc += (len(s)-i)
        else:
            stusc += (len(s)-i)

    if kevsc > stusc:
        print("Kevin", kevsc)
    elif kevsc < stusc:
        print("Stuart", stusc)
    else:
        print("Draw")
    
if __name__ == '__main__':
    s = input()
    minion_game(s)