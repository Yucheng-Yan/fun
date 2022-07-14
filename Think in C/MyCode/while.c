#include <stdio.h>

int main() {
    /* Count from 1 to n */
    int i = 1;
    int n;
    puts("type a number: ");
    scanf("%d", &n);
    while (i <= n) {
        printf("%d\n", i++);
    }
    return 0;
}