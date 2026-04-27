#include<iostream>
using namespace std;
int main() {
	int a, b, c;
	cin >> a >> b >> c;
	if (a == 0) {
		if (b == 0) {
			if (c == 0)
				cout << "*";
			else
				cout << "C";
		}
		else {
			if (c == 0)
				cout << "B";
			else
				cout << "A";
		}
	}
	else {
		if (b == 0) {
			if (c == 0)
				cout << "A";
			else
				cout << "B";
		}
		else {
			if (c == 0)
				cout << "C";
			else
				cout << "*";
		}
	}
	return 0;
}