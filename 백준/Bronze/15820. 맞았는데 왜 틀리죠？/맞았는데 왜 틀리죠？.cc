#include<stdio.h>
int main() {
    long long s1, s2, a, m;
    int res1 = 0, res2 = 0;
    scanf("%lld %lld", &s1, &s2);
    for (int i = 0; i < s1; i++) {
        scanf("%lld %lld", &a, &m);
        if (a != m) {
            res1++;
            break;
        }
    }
    for (int i = 0; i < s2; i++) {
        scanf("%lld %lld", &a, &m);
        if (a != m) {
            res2++;
            break;
        }
    }
    if (res1 > 0)
        printf("Wrong Answer");
    else if (res2 > 0)
        printf("Why Wrong!!!");
    else
        printf("Accepted");
    return 0;
}