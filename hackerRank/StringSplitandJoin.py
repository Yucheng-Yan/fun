def split_and_join(line):
    ls = line.split()
    ls = '-'.join(ls)
    return ls

if __name__ == '__main__':
    line = input()
    result = split_and_join(line)
    print(result)