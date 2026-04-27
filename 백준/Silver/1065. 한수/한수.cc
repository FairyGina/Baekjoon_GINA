#include <stdio.h>
int main() {
    int a, a100, a10, a1,res=0;
    scanf("%d", &a);
    if (a < 100)
        printf("%d", a);
    if (a >= 100) {
        for (int i = 100; i <= a; i++) {
            a100 = i / 100;
            a10 = (i - a100 * 100) / 10;
            a1 = i - (a100 * 100 + a10 * 10);

            if ((a100 - a10) == (a10 - a1))
                res++;

        }
        printf("%d", res+99);
    }
   

    return 0;
}