#include<iostream>
using namespace std;
int main() {
	int a1, a2, a3, b1, b2, b3;
	cin >> a1 >> a2 >> a3 >> b1 >> b2 >> b3;
	if (a1 * 3 + a2 * 2 + a3 > b1 * 3 + b2 * 2 + b3)
		cout << 'A';
	if (a1 * 3 + a2 * 2 + a3 < b1 * 3 + b2 * 2 + b3)
		cout << 'B';
	if (a1 * 3 + a2 * 2 + a3 == b1 * 3 + b2 * 2 + b3)
		cout << 'T';
	return 0;
}