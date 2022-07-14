import textwrap

def wrap(string, max_width):
    stri=""
    for i in range(0, len(string), max_width):
        if i != 24:
            stri += string[i:i+max_width] + "\n"
        elif i == 24:
            stri += string[i:i+max_width]
    return stri

if __name__ == '__main__':
    string, max_width = input(), int(input())
    result = wrap(string, max_width)
    print(result)
    
    
    

# def wrap(string, max_width):
#     ls = textwrap.fill(string, max_width)
#     return ls

# if __name__ == '__main__':
#     string, max_width = input(), int(input())
#     result = wrap(string, max_width)
#     print(result)
    
# #test
# string = "This      is        a very very very very very long string."
# print(textwrap.wrap(string,8))
# print(textwrap.fill(string,8))