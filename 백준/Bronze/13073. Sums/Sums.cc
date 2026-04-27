#include<iostream>
using namespace std;
int main() {
    cin.sync_with_stdio(false);
    cin.tie(nullptr);
    int t, n, res;
    cin >> t;
    for (int i = 0; i < t; i++) {
        cin >> n;
        res = 0;
        for (int j = 1; j <= n; j++) {
            res += j;
        }
        cout << res << " ";
        res = 0;
        for (int j = 1; j <= 2 * n; j++) {
            if (j % 2 != 0)
                res += j;
        }
        cout << res << " ";
        res = 0;
        for (int j = 1; j <= 2 * n; j++) {
            if (j % 2 == 0)
                res += j;
        }
        cout << res << "\n";
    }
    return 0;
}