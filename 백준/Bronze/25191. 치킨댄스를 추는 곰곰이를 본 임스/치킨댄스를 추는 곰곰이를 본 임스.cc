#include<iostream>
using namespace std;
int main() {
    cin.sync_with_stdio(false);
    cin.tie(nullptr);
    int store, coke, beer;
    cin >> store >> coke >> beer;
    if (store - beer < 0)
        cout << store;
    else {
        coke /= 2;
        if (store - beer - coke < 0)
            cout << store;
        else
            cout << beer + coke;
    }
    return 0;
}