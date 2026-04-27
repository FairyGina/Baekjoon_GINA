#include<iostream>
#include<cmath>
using namespace std;
int main() {
    cin.sync_with_stdio(false);
    cin.tie(nullptr);
    int n;
    while (1) {
        cin >> n;
        if (n == 0)
            break;
        cout << n << " => " << n * n - n + 1 << endl;
    }
    return 0;
}