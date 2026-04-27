#include<stdio.h>
int main() {
    int n, m, res = 0, min = 10001;
    scanf("%d %d", &n, &m);
    int prime[10001] = { 1 };
    for (int i = 4; i <= m; i += 2)
        prime[i] = 1;
    for (int i = 2; i * i <= m; i++) {
        for (int j = i * i; j <= m; j += i * 2)
            prime[j] = 1;
    }
    prime[1] = 1;
    for (int i = n; i <= m; i++) {
        if (prime[i] != 1) {
            if (min > i)
                min = i;
            res += i;
        }
    }
    if (min == 10001)
        printf("-1");
    else printf("%d\n%d", res, min);
    return 0;
}