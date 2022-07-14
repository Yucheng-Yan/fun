#include <stdio.h>

int main() {
    int osum = 0;
    int esum = 0;
    int n;

    while(1) {
        puts("Enter a number: ");
        scanf("%d", &n);
        if (n == 0)
            break;
        switch(n % 2) {
            case 0: 
                esum += n;
                break;
            case 1:
                osum += n;
                break;
        }
    }
    printf("Sum of events: %d\n", esum);
    printf("Sum of odds: %d\n", osum);
    return 0;
}