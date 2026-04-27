#include<stdio.h>
int main() {
    int p, q, s, min = 0, n = 1;
    scanf("%d %d %d", &p, &q, &s);
    if (p > q) min = q;
    else min = p;
    int p1 = p, q1 = q;
    for (int i = min; i > 1; i--)
        if ((p1 % i == 0) && (q1 % i == 0))
            n *= i, p1 /= i, q1 /= i;
    if (s < p * q / n) printf("no");
    else printf("yes");
    return 0;
}