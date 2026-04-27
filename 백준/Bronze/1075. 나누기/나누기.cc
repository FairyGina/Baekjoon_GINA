#include<iostream>
using namespace std;
int main() {
    cin.sync_with_stdio(false);
    cin.tie(nullptr);
    long long n, f, nres;
    cin >> n >> f;
    nres = n % f;
    n %= 100;
    if (n >= nres) {
        n -= nres;
        if (n >= f)
            n %= f;
    }
    else
        n += (f - nres);
    if (n < 10)
        cout << 0 << n;
    else
        cout << n;
    return 0;
}