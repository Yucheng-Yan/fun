// #include <stdio.h>
// #include <string.h>
// #define LEN 10

// struct Employee {
//     char last[LEN];
//     char first[LEN];
//     float salary;
// };

// struct Company{
//     struct Employee name_list[30];
//     int nEmployees;
// };

// int main() {
//     struct Company cp;
//     int i;
//     cp.nEmployees = 0;

//     /* ask user to create new employees */
//     // while(1) {
//         puts("Enter the last name of your employee: ");
//         char input;
//         scanf("%s", &input);
//         //cp.name_list[cp.nEmployees].last = input;

//         //printf(">>>length = %d", length);
//         if (strlen(input) == 0 )
//             puts("shi0");

//         //printf("%s", &cp.name_list[cp.nEmployees].last);
//         //cp.name_list[cp.nEmployees].last = scanf("%s");
//     // }
//     return 0;
// }

//Standard answer

/* lab5.c */
#include <stdio.h>
#include <string.h>

#define MAXEMPS 10

struct Employee {
    char last[16];
    char first[11];
    char title[16];
    int salary;
};

int main() {
    struct Employee emps[MAXEMPS];
    int n, i;

    for (n = 0; n < MAXEMPS; ++n) {
        printf("Enter last: "); fflush(stdout);
        gets(emps[n].last);
        if (strlen(emps[n].last) == 0)
            break;
        printf("Enter first: "); fflush(stdout);
        gets(emps[n].first);
        printf("Enter title: "); fflush(stdout);
        gets(emps[n].title);
        printf("Enter salary: "); fflush(stdout);
        scanf("%d", &emps[n].salary);
        getchar(); /* eat newline */
    }

    for (i = 0; i < n; ++i)
        printf("{%s, %s, %s, %d}\n",
                emps[i].last,
                emps[i].first,
                emps[i].title,
                emps[i].salary);
    return 0;
}