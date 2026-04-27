#include<iostream>
using namespace std;
int main() {
	int t, n;
	double c, g, resc, resg;
	cin >> t;
	for (int i = 0; i < t; i++) {
		resc = 0, resg = 0;
		cin >> n;
		for (int j = 0; j < n; j++) {
			cin >> c >> g;
			resc += c;
			resg += c * g;
		}
		cout << fixed;
		cout.precision(0);
		cout << resc << " ";
		cout << fixed;
		cout.precision(1);
		cout << resg / resc << "\n";
	}
	return 0;
}