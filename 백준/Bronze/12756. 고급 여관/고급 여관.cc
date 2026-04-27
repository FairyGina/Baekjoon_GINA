#include<iostream>
using namespace std;
int main() {
    int a, b, c, d, aa = 0, bb = 0;
    cin >> a >> b >> c >> d;
    if (d % a != 0)
        aa = d / a + 1;
    else
        aa = d / a;
    if (b % c != 0)
        bb = b / c + 1;
    else
        bb = b / c;
    if (aa > bb)
        cout << "PLAYER B";
    else if (aa < bb)
        cout << "PLAYER A";
    else
        cout << "DRAW";
    return 0;
}