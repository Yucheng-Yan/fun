def count_substring(string, sub_string):
    counter = 0
    i = 0
    while i < len(string):
        letter = string[i]
        if letter == sub_string[0]:
            if sub_string == string[i:i+len(sub_string)]:
                counter += 1
        i += 1
    return counter

if __name__ == '__main__':
    string = input().strip()
    sub_string = input().strip()
    
    count = count_substring(string, sub_string)
    print(count)