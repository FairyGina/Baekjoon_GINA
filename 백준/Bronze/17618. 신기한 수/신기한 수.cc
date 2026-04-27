#include<iostream>
using namespace std;
int main() {
    int n, num = 0, res = 0, a;
    cin >> n;
    for (int i = 1; i <= n; i++) {
        a = i;
        num = 0;
        while (1) {
            num += a % 10;
            a /= 10;
            if (a == 0)
                break;
        }
        if (i % num == 0)
            res++;
    }
    cout << res;
    return 0;
}