#include<iostream>
#include<algorithm>
using namespace std;
bool desc(int a, int b) {
    return a > b;
}
int main() {
    cin.sync_with_stdio(false);
    cin.tie(nullptr);
    int score[50], hong;
    for (int i = 0; i < 50; i++) {
        cin >> score[i];
    }
    cin >> hong;
    sort(score, score + 50, desc);
    for (int i = 0; i < 50; i++) {
        if (hong == score[i]) {
            hong = i;
            break;
        }
    }
    if (hong < 5)
        cout << "A+";
    else if (hong < 15)
        cout << "A0";
    else if (hong < 30)
        cout << "B+";
    else if (hong < 35)
        cout << "B0";
    else if (hong < 45)
        cout << "C+";
    else if (hong < 48)
        cout << "C0";
    else if (hong < 50)
        cout << "F";
    return 0;
}