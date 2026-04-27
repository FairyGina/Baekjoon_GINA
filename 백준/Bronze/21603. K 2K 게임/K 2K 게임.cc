#include<iostream>
using namespace std;
int main() {
    cin.sync_with_stdio(false);
    cin.tie(nullptr);
    int n, m, m2,num, res = 0, number[100000] = { 0 };
    cin >> n >> m;
    m %= 10;
    m2 = 2 * m % 10;
    for (int i = 1, j = 0; i <= n; i++) {
        num = i % 10;
        if ((m != num) && m2 != num) {
            res++;
            number[j] = i;
            j++;
        }
    }
    cout << res << "\n";
    for (int i = 0; i < res; i++)
        cout << number[i] << " ";
    return 0;
}