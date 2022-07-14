#include <stdio.h>

int main() {
    int n;
    puts("Enter a number:");
    scanf("%d", &n);
    for (int i = 1; i <= n; i++)
        printf("i = %d\n", i);
    return 0;
}