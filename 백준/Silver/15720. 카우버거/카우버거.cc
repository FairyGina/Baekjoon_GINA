#include<iostream>
#include<algorithm>
using namespace std;
bool desc(int a, int b) {
    return a > b;
}
int repeat(int n, int money[]) {
    for (int i = 0; i < n; i++) {
        cin >> money[i];
    }
    return *money;
}
int main() {
    int b, c, d, res1 = 0, res2 = 0, res3 = 0, size = 1000;
    int a[3];
    int bmoney[1000] = { 0 };
    int cmoney[1000] = { 0 };
    int dmoney[1000] = { 0 };
    cin >> b >> c >> d;
    a[0] = b, a[1] = c, a[2] = d;
    repeat(b, bmoney), repeat(c, cmoney), repeat(d, dmoney);
    sort(a, a + 3), sort(bmoney, bmoney + 1000, desc), sort(cmoney, cmoney + 1000, desc), sort(dmoney, dmoney + 1000, desc);
    for (int i = 0; i < a[2]; i++) {
        res1 += *(bmoney + i) + *(cmoney + i) + *(dmoney + i);
    }
    cout << res1 << endl;
    for (int i = 0; i < a[0]; i++) {
        res2 += *(bmoney + i) + *(cmoney + i) + *(dmoney + i);
        res3 += (*(bmoney + i) + *(cmoney + i) + *(dmoney + i)) * 9 / 10;
    }
    cout << res3 + res1 - res2;
    return 0;
}