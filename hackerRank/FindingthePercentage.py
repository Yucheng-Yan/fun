if __name__ == '__main__':
    n = int(input())
    student_marks = {}
    for _ in range(n):
        name, *line = input().split()
        scores = list(map(float, line))
        student_marks[name] = scores
    query_name = input()
    
    num = 0
    i = 0
    if query_name in student_marks:
        while i < len(student_marks[query_name]):
            num += student_marks[query_name][i]
            i += 1
        mean = num / len(student_marks[query_name])
        print("%.2f" % mean)

