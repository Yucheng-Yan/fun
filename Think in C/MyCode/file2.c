/* file2.c */
#include <stdio.h>
#include "file1.c"

int main() {
    extern int i;
    /* extern optional for functions: */
    int get_j(void);

    printf("i == %d\n", ++i);
    printf("j == %d\n", get_j());
    return 0;
}