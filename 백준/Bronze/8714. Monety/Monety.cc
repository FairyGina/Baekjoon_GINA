#include <iostream>
using namespace std;
int main() {
    cin.sync_with_stdio(false);
    cin.tie(nullptr);
    bool a;
    int n, res = 0;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> a;
        if (a == 0)
            res++;
    }
    if (n > 2 * res)
        cout << res;
    else
        cout << n - res;
    return 0;
}