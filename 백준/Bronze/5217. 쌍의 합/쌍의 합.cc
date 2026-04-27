#include <iostream>
using namespace std;
int main() {
    int t, n;
    cin >> t;
    for (int i = 0; i < t; i++) {
        bool q = 0;
        cin >> n;
        cout << "Pairs for " << n << ": ";
        for (int j = 1; j <= n / 2; j++) {
            if (j != n - j) {
                if (q == 0) {
                    cout << j << " " << n - j;
                    q = 1;
                }
                else {
                    cout << ", " << j << " " << n - j;
                }
            }
        }
        cout << "\n";
    }
    return 0;
}