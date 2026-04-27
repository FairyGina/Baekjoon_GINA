#include <stdio.h>
int main() {
    while (1) {
        int n, l, res = 0;
        scanf("%d", &n);
        if (n < 0)
            break;
        for (int i = 1; i <= n / 2; i++)
            if (n % i == 0)
                res += i, l = i;
        if (res == n) {
            printf("%d =", n);
            for (int i = 1; i <= l; i++)
                if (n % i == 0) {
                    printf(" %d", i);
                    if (i != l)
                        printf(" +");
                    else
                        printf("\n");
                }
        }
        else
            printf("%d is NOT perfect.\n", n);
    }
    return 0;
}