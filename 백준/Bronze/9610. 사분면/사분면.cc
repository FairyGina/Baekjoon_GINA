#include<iostream>
using namespace std;
int main() {
	int n, x, y;
	int res[5] = { 0 };
	cin >> n;
	for (int i = 0; i < n; i++) {
		cin >> x >> y;
		if ((x == 0) || (y == 0))
			res[0]++;
		if ((x > 0) && (y > 0))
			res[1]++;
		if ((x < 0) && (y > 0))
			res[2]++;
		if ((x < 0) && (y < 0))
			res[3]++;
		if ((x > 0) && (y < 0))
			res[4]++;
	}
	cout << "Q1: " << res[1] << "\n" << "Q2: " << res[2] << "\n" << "Q3: " << res[3] << "\n" << "Q4: " << res[4] << "\n" << "AXIS: " << res[0];
	return 0;
}