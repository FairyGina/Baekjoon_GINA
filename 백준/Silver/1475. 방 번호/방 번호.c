#include<stdio.h>
int main() {
    int n, max = 0, num[10] = { 0 };
    scanf("%d", &n);
    while (1) {
        if (n < 10) {
            for (int i = 0; i < 10; i++) {
                if (n % 10 == i) {
                    num[i]++;
                    break;
                }
            }
            break;
        }
        for (int i = 0; i < 10; i++) {
            if (n % 10 == i) {
                num[i]++;
                n /= 10;
                break;
            }
        }
    }
    
    if ((num[6] + num[9]) % 2 != 0)
        num[6] = (num[6] + num[9]) / 2 + 1;
    else
        num[6] = (num[6] + num[9]) / 2;
    num[9] = 0;
    for (int i = 0; i < 10; i++)
        if (max < num[i])
            max = num[i];
    printf("%d", max);
    return 0;
}