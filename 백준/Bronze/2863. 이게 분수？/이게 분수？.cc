#include<iostream>
using namespace std;
int main() {
	int a, b, c, d, res, min = 201;
	cin >> a >> b >> c >> d;
	if (a + b < min) {
		min = a + b;
		res = 2;
	}
	if (b + d < min) {
		min = b + d;
		res = 1;
	}
	if (c + d < min) {
		min = c + d;
		res = 0;
	}
	if (a + c < min) {
		min = a + c;
		res = 3;
	}
	cout << res;
	return 0;
}