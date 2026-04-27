#include<iostream>
using namespace std;
int main() {
	int n, res;
	int s[4] = { 0 };
	while (1) {
		cin >> n;
		res = 0;
		if (n == 0)
			break;
		s[0] = n / 1000;
		s[1] = n / 100 - s[0] * 10;
		s[2] = n / 10 - 100 * s[0] - 10 * s[1];
		s[3] = n - s[0] * 1000 - s[1] * 100 - s[2] * 10;
		for (int i = 0; i < 4; i++) {
			if (s[i] == 0)
				res += 5;
			else if (s[i] == 1)
				res += 3;
			else
				res += 4;
		}
		if (s[0] != 0)
			cout << res + 1 << "\n";
		else {
			if (s[1] != 0)
				cout << res - 4 << "\n";
			else {
				if (s[2] != 0)
					cout << res - 9 << "\n";
				else
					cout << res - 14 << "\n";
			}
		}
	}

	return 0;
}