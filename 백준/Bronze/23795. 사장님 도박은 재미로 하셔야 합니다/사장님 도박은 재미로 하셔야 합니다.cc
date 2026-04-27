#include <iostream>
using namespace std;
int main() {
    long long n, res = 0;
    while (1) {
        cin >> n;
        if (n == -1)
            break;
        res += n;
    }
    cout << res;
    return 0;
}