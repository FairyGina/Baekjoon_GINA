#include<stdio.h>
#include<stdlib.h>
int main() {
    int a, b, c, d;
    while (1) {
        scanf("%d %d %d %d", &a, &b, &c, &d);
        if (a + b + c + d == 0)
            break;
        int resa = 0, resb = 0, resc = 0, resd = 0, i = 0;
        while (1) {
            if ((a == b) && (b == c) && (c == d)) break;
            resa = abs(a - b), resb = abs(b - c), resc = abs(c - d), resd = abs(d - a), i++;
            a = resa, b = resb, c = resc, d = resd;
        }
        printf("%d\n", i);
    }
    return 0;
}