#include <stdio.h>

int main() {
    /* Count from 1 to n */
    int i = 1;
    int n;
    puts("type a number: ");
    scanf("%d", &n);
    do
        printf("%d\n", i++);
    while (i <= n);
    printf(">>>i = %d", i);
    return 0;
}