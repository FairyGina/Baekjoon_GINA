#include<iostream>
using namespace std;
int main() {
	unsigned long long t, z1, z2, m, give, res = 0, max = 0;
	cin >> t >> z1 >> z2 >> m;
	z1 %= t, z2 %= t;
	z1 = t - z1, z2 = t - z2, max = m / t, give = m;
	if (1 + (m - z1) / t > max) {
		max = 1 + (m - z1) / t;
		give = m - z1;
		if (z1 > z2) {
			max = 1 + (m - z2) / t;
			give = m - z2;
		}
	}
	if (1 + (m - z2) / t > max) {
			max = 1 + (m - z2) / t;
			give = m - z2;
	}
	if (2 + (m - z1 - z2) / t > max) {
		max = 2 + (m - z1 - z2) / t;
		give = m - z1 - z2;
	}
	cout << give;
	return 0;
}