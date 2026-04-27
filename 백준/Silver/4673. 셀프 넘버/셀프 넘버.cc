#include <stdio.h>
int self(int n) {
    int res = n;
    while (1) {
        if (n / 10 == 0) {
            res += n % 10;
            break;
        }
        res += n % 10;
        n /= 10;
    }
    if (res < 10001)
        return res;
    else
        return 0;
}
int main() {
    bool n[10001] = { 0 };
    for (int i = 1; i < 10001; i++)
        n[self(i)] = 1;
    for (int i = 1; i < 10001; i++)
        if (n[i] == 0)
            printf("%d\n", i);
    return 0;
}