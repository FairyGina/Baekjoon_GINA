#include<stdio.h>
int main() {
    int n, m;
    scanf("%d %d", &n, &m);
    bool prime[1000000];
    for (int i = 2; i <= m; i++)
        prime[i] = true;
    for (int i = 4; i <= m; i += 2)
        prime[i] = false;
    for (int i = 2; i * i <= m; i++) {
        for (int j = i * i; j <= m; j += i * 2)
            prime[j] = false;
    }
    for (int i = n; i <= m; i++) {
        if (prime[i] != false)
            printf("%d ", i);
    }
    return 0;
}