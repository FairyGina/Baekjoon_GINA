#include<iostream>
using namespace std;
int main() {
    cin.sync_with_stdio(false);
    cin.tie(nullptr);
    int t, n, num;
    cin >> t;
    for (int i = 0; i < t; i++) {
        cin >> n;
        int max = -1000000, min = 1000000;
        for (int j = 0; j < n; j++) {
            cin >> num;
            if (num > max)
                max = num;
            if (num < min)
                min = num;
        }
        cout << min << " " << max << "\n";
    }
    return 0;
}