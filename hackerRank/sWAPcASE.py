def swap_case(s):
    ls = s.split()
    i = 0
    string = ''
    while i < len(ls):
        for k in range(len(ls[i])):
            if ls[i][k].upper() == ls[i][k]:
                string += ls[i][k].lower()
            else:
                string += ls[i][k].upper()
        string += ' '
        i += 1
    return string

if __name__ == '__main__':
    s = input()
    result = swap_case(s)
    print(result)