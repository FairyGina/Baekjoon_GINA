#include<iostream>
using namespace std;
int main() {
    long long l, answer[4] = { 0 };
    char pno[1000001] = { 0 }, res[5] = { 'A', 'C', 'G', 'T' };
    cin >> l;
    for (int i = 0; i < l; i++) {
        cin >> pno[i];
        for (int j = 0; j < 4; j++) {
            if (pno[i] == res[j])
                answer[j]++;
        }
    }
    cout << answer[0] * answer[1] % 1000000007 * answer[2] % 1000000007 * answer[3] % 1000000007;
    return 0;
}