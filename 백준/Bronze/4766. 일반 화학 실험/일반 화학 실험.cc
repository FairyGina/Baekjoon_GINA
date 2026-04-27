#include<iostream>
using namespace std;
int main() {
	double n1, n2;
	cin >> n1;
	while (1) {
		cin >> n2;
		if (n2 == 999)
			break;
		cout << fixed;
		cout.precision(2);
		cout << n2 - n1 << "\n";
		n1 = n2;
	}
	return 0;
}