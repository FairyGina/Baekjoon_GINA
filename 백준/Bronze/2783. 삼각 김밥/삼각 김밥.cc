#include<iostream>
using namespace std;
int main() {
	double x, y, n, m, x1 = 0, y1 = 0, min = 100000;
	cin >> x >> y >> n;
	if ((x / y) * 1000 < min)
		min = (x / y) * 1000;
	for (int i = 0; i < n; i++) {
		cin >> x1 >> y1;
		if ((x1 / y1) * 1000 < min)
			min = (x1 / y1) * 1000;
	}
	cout << fixed;
	cout.precision(2);
	cout.setf(ios::showpoint);
	cout << min;
	return 0;
}