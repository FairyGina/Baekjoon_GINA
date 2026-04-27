#include<iostream>
#include<string>
using namespace std;
int main() {
    cin.sync_with_stdio(false);
    cin.tie(nullptr);
    int n, res = 0;
    string ch;
    cin >> n >> ch;
    for (int i = 0; i < ch.length(); i++){
        if (ch[i] != 'C')
            res++;
    }
    cout << ch.length() / (res + 1);
    return 0;
}