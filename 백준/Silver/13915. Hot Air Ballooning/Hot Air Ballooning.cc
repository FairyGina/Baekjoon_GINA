#include<iostream>
#include<cmath>
using namespace std;
int air(int n) {
    int h, num, res, res2 = 0;
    int repeat[512] = { 0 };
    for (int i = 0; i < n; i++) {
        res = 0;
        int number[9] = { 0 };
        cin >> h;
        while (1) {
            num = h % 10;
            h /= 10;
            for (int j = 1; j < 10; j++) {
                if (num == j)
                    if (number[j-1] == 0)
                        number[j-1]++;
            }
            if (h == 0)
                break;
        }
        for (int j = 0; j < 9; j++) {
            if (number[j] == 1)
                res += pow(2, j);
        }
        if (repeat[res] == 0)
            repeat[res]++;
        num = 0;
    }
    for (int i = 0; i < 512; i++) {
        res2 += repeat[i];
    }
    return res2;
}
int main() {
    int n;
    while (true) {
        cin >> n;
        if (cin.eof() == true) {
            break;
        }
        else {
            cout << air(n) << endl;
        }
    }
    return 0;
}