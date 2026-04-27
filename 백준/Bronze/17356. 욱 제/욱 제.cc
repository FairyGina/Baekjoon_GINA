#include<iostream>
#include<cmath>
using namespace std;
int main() {
    cin.sync_with_stdio(false);
    cin.tie(nullptr);
    double n, m, res, win;
    cin >> n >> m;
    res = (m - n) / 400;
    cout << 1 / (1 + pow(10, res));
    return 0;
}