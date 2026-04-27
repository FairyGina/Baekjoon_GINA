#include<iostream>
using namespace std;
int main() {
	int a, a1;
	cin >> a;
	if (a > 2000) {
		if (a > 2010) {
			a1 = a % 2010;
			if ((a1 == 3) || (a1 == 8))
				cout << "SPbSU";
			else {
				cout << "ITMO";
			}
		}
		else {
			a1 = a % 2000;
			if (a1 == 6)
				cout << "PetrSU, ITMO";
			else if ((a1 == 7) || (a1 == 8)|| (a1 == 0))
				cout << "SPbSU";
			else
				cout << "ITMO";
		}
	}
	else {
		a1 = a % 1990;
		if ((a1 == 5) || (a1 == 8) || (a1 == 9))
			cout << "ITMO";
		else
			cout << "SPbSU";
	}
	return 0;
}