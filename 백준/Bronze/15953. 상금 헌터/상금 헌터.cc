#include<iostream>
using namespace std;
int main() {
	unsigned int n, a, b, res = 0;
	cin >> n;
	for (int i = 0; i < n; i++) {
		res = 0;
		cin >> a >> b;
		if (a == 1)
			res += 5000000;
		if ((a > 1) && (a < 4))
			res += 3000000;
		if ((a > 3) && (a < 7))
			res += 2000000;
		if ((a > 6) && (a < 11))
			res += 500000;
		if ((a > 10) && (a < 16))
			res += 300000;
		if ((a > 15) && (a < 22))
			res += 100000;
		if (b == 1)
			res += 5120000;
		if ((b > 1) && (b < 4))
			res += 2560000;
		if ((b > 3) && (b < 8))
			res += 1280000;
		if ((b > 7) && (b < 16))
			res += 640000;
		if ((b > 15) && (b < 32))
			res += 320000;
		cout << res << "\n";
	}
	return 0;
}