#include<iostream>
#include<algorithm>
using namespace std;
int main() {
    cin.sync_with_stdio(false);
    cin.tie(nullptr);
    int number[3];
    char alpha[4];
    string a;
    for (int i = 0; i < 3; i++)
        cin >> number[i];
    sort(number, number + 3);
    cin >> a;
    for (int i = 0; i < 3; i++)
        alpha[i] = a[i] - 65;
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (alpha[i] == j)
                cout << number[j] << endl;
        }
    }
    return 0;
}