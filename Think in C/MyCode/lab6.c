/* lab6.c */
#include "employee.h"
#include "employee.c"
#include <stdio.h>

int main() {
    int i;

    /* Fill Employee array: */
    while (addEmployee() != -1) {
        printf("Num of emp is: %d\n", numEmployees());
    }
    /* Print each Employee; */
    for (i = 0; i < numEmployees(); ++i) {
        printEmployee(i);
        putchar('\n');
    }
    return 0;
}