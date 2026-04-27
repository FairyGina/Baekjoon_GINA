#include<iostream>
using namespace std;
int main() {
    cin.sync_with_stdio(false);
    cin.tie(nullptr);
    int n, m, res = 0;
    cin >> n >> m;
    while (1) {
        res += n;
        n /= m;
        if (n < 1) {
            cout << res;
            break;
        }
    }
    return 0;
}