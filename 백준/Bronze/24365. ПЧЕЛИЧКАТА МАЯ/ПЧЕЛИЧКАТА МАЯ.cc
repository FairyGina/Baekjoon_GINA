#include<iostream>
using namespace std;
int main() {
    cin.sync_with_stdio(false);
    cin.tie(nullptr);
    int a, b, c, ave;
    cin >> a >> b >> c;
    ave = (a + b + c) / 3;
    cout << 2 * (ave - a) + (ave - b);
    return 0;
}