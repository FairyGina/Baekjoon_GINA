#include<iostream>
using namespace std;
int main() {
	double t, p, mn, res;
	cin >> t >> p;
	if (p > 20) {
		mn = t / (100 - p);
		res = mn*(p+20);
	}
	else {
		mn = t / (120 - 2 * p);
		res = mn*2*p;
	}
	cout.precision(10);
	cout << res;
	return 0;
}