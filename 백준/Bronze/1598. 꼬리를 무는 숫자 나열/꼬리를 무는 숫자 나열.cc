#include<iostream>
#include<cmath>
using namespace std;
int main() {
	int a, b, p, q;
	cin >> a >> b;
	p = abs((a - 1) / 4 - (b - 1) / 4);
	q = abs((a - 1) % 4- (b - 1) % 4);
	cout << p + q;

	return 0;
}