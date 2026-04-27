#include<stdio.h>
#include<math.h>
int main() {
    int i = 0;
    while (1) {
        float a, b, c, res;
        char side;
        i++;
        scanf("%f %f %f", &a, &b, &c);
        if (a + b + c == 0)
            break;
        if (a == -1)
            res = sqrt(c * c - b * b), side = 'a';
        else if (b == -1)
            res = sqrt(c * c - a * a), side = 'b';
        else
            res = sqrt(a * a + b * b), side = 'c';
        if (res > 0)
            printf("Triangle #%d\n%c = %.3f\n\n", i, side, res);
        else
            printf("Triangle #%d\nImpossible.\n\n", i);
    }
    return 0;
}