#include<iostream>
using namespace std;
int main() {
	int n, n10, n1;
	cin >> n;
	n10 = n / 10;
	n1 = n - n10 * 10;
	if (n10 <= 10)
		cout << n10 + n1;
	else {
		if (n10 == 100) {
			n10 = 10;
			n1 = n - 1000;
			cout << n10 + n1;
		}
		else {
			n10 = n / 100;
			n1 = n - n10 * 100;
			cout << n10 + n1;
		}
	}
	return 0;
}