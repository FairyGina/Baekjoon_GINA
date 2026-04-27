#include <iostream>
using namespace std;
int main() {
    double a, b, res;
    cin >> a >> b;
    res = a * ((100 - b) / 100);
    if (res < 100)
        cout << 1;
    else
        cout << 0;
    return 0;
}