#include<iostream>
using namespace std;
int main() {
	double l, r;
	cin >> l >> r;
	cout << fixed;
	cout.precision(6);
	cout << 2 * l + 2 * r * 3.141592;

	return 0;
}