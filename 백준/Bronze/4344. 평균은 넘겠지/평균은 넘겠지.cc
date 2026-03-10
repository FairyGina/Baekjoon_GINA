#include <stdio.h>
int main() {
    int c,d;
    double res = 0;
    double res1 = 0;
    int n[1001] = { 0 };
    int i, j;
    scanf("%d", &c);
    
    for (j = 0; j < c; j++) {
        scanf("%d", &d);
        for (i = 0; i < d; i++) {
            scanf("%d", &n[i]);


        }
        for (i = 0; i < d; i++)
            res += n[i];

        res /= d;

        for (i = 0; i < d; i++) {
            if (n[i] > res) {
                res1++;
            }
        }

        printf("%.3f%%\n", res1 * 100 / d);
        res1 = 0;
        res = 0;
        n[i] = {0};
    }

    return 0;
}