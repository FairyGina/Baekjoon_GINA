#include<iostream>
#include<algorithm>
using namespace std;
bool desc(int a, int b) {
    return a > b;
}
int main() {
    cin.sync_with_stdio(false);
    cin.tie(nullptr);
    unsigned long long n, res = 0;
    int c[100001] = { 0 };
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> c[i];
    }
    sort(c, c + n, desc);
    for (int i = 0; i < n; i += 3) {
        res += c[i] + c[i + 1];
    }
    cout << res;
    return 0;
}