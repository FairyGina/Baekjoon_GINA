#include<stdio.h>
int main() {
    int t, n[100];
    scanf("%d", &t);
    for (int i = 0; i < t; i++)
        scanf("%d", &n[i]);
    int res = 0, max = n[t - 1];
    for (int i = t - 2; i > -1; i--) {
        if (n[i] >= max) max--, res += n[i] - max;
        else max = n[i];
    }
    printf("%d", res);
    return 0;
}