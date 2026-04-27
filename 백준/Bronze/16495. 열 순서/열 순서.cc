#include<iostream>
#include<cmath>
using namespace std;
int main() {
    cin.sync_with_stdio(false);
    cin.tie(nullptr);
    unsigned long long res = 0;
    string a;
    cin >> a;
    for (int i = 0; i < a.length(); i++)
        res += ((a[a.length() - i - 1] - 64) * pow(26, i));
    cout << res;
    return 0;
}