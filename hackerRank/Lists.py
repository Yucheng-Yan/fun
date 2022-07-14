if __name__ == '__main__':
    N = int(input())
    i = 0
    ls = []
    while i < N:
        command = input().split()
        if command[0] == "insert":
            ls.insert(int(command[1]), int(command[2]))
        elif command[0] == "print":
            print(ls)
        elif command[0] == "remove":
            ls.remove(int(command[1]))
        elif command[0] == "append":
            ls.append(int(command[1]))
        elif command[0] == "sort":
            ls.sort()
        elif command[0] == "pop":
            ls.pop()
        elif command[0] == "reverse":
            ls.reverse()
        i += 1