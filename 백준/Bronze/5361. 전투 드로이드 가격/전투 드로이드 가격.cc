#include<iostream>
using namespace std;
int main() {
	double s[5];
	double res = 0;
	int n;
	cin >> n;
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < 5; j++)
			cin >> s[j];
		cout << fixed;
		cout.precision(2);
		cout.setf(ios::showpoint);
		cout << "$" << s[0] * 350.34 + s[1] * 230.90 + s[2] * 190.55 + s[3] * 125.30 + s[4] * 180.90 << "\n";
	}
	return 0;
}