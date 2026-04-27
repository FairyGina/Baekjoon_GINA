#include<iostream>
using namespace std;
int main() {
    int tax;
    while (1) {
        cin >> tax;
        if (tax == 0)
            break;
        else {
            if((tax > 1000000)&&(tax < 5000000))
                tax = tax * 9 / 10;
            else if (tax > 5000000)
                tax = tax * 4 / 5;
            cout << tax << "\n";
        }
    }
    return 0;
}