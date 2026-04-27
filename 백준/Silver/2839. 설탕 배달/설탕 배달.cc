#include<iostream>
using namespace std;
int main() {
	int n, five, three, i = 0;
	cin >> n;
	five = n / 5;
	if (n % 5 == 0)
		cout << five;
	else {
		while (1) {
			three = n - 5 * (five - i);
			if (five - i < 0) {
				cout << "-1";
				break;
			}
			else {
				if (three % 3 == 0) {
					cout << five - i + three / 3;
					break;
				}
				else
					i++;
			}
		}
	}
	return 0;
}