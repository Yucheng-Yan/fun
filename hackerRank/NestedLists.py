if __name__ == '__main__':
    nested_ls = []  
    for _ in range(int(input())):
        name = input()
        score = float(input())  
        nested_ls.append([name, score])  
    

    def find_smallest(ls):
        i = 0
        smallest = ls[0][1]
        while i < len(ls):
            if smallest > ls[i][1]:
                smallest = ls[i][1]
            i += 1
        return smallest
    
    def remove_smallest(ls, smallest):
        i = 0
        while i < len(ls):
            if smallest == ls[i][1]:
                ls.remove(ls[i])
                continue
            i += 1
        return ls

    smallest = find_smallest(nested_ls)
    ls1 = remove_smallest(nested_ls, smallest)
    #print(">>>After remove the smallest one: ", ls1)
   
    ls = []
    i = 0
    while i < len(ls1):
        if find_smallest(ls1) == ls1[i][1]:
            ls.append(ls1[i][0]) 
        i += 1
    ls.sort()
    i = 0
    while i < len(ls):
        print(ls[i])
        i += 1

    




