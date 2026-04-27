#include<iostream>
using namespace std;
int main() {
	int a, b, a100, a10, a1, b100, b10, b1;
	cin >> a >> b;
	a100 = a / 100;
	a10 = (a - a100 * 100) / 10;
	a1 = a - a100 * 100 - a10 * 10;
	b100 = b / 100;
	b10 = (b - b100 * 100) / 10;
	b1 = b - b100 * 100 - b10 * 10;
	a = a1 * 100 + a10 * 10 + a100;
	b = b1 * 100 + b10 * 10 + b100;
	if (a > b)
		cout << a;
	if (a < b)
		cout << b;
	return 0;
}