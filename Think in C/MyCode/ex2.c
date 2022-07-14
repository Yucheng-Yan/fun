#include <stdio.h>
#include <float.h>
#define prenum 100

int main() {
    float num;
    printf("Enter a number: ");
    scanf("%f", &num);
    printf("Your original number is %f.\n", num);
    int num_after = (int)(num + 0.5);
    printf("After rounding, the number is %d.\n", num_after);
    printf("prenum = %d", prenum);
    return 0;
}

// int main() {
//     float x;
//     int n;

//     printf("Enter a real number: ");
//     fflush(stdout);
//     scanf("%f", &x);
//     n = (int)(x + 0.5);
//     printf("%f rounded == %d\n", x, n);
//     return 0;
// }
