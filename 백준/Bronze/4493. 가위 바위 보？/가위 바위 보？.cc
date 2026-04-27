#include<iostream>
using namespace std;
int main() {
	int t, n, res1, res2;
	char rps1, rps2;
	cin >> t;
	for (int i = 0; i < t; i++) {
		cin >> n;
		res1 = 0, res2 = 0;
		for (int j = 0; j < n; j++) {
			cin >> rps1 >> rps2;
			if (rps1 == 'R') {
				if (rps2 == 'S')
					res1++;
				if (rps2 == 'P')
					res2++;
			}
			if (rps1 == 'S') {
				if (rps2 == 'P')
					res1++;
				if (rps2 == 'R')
					res2++;
			}
			if (rps1 == 'P') {
				if (rps2 == 'R')
					res1++;
				if (rps2 == 'S')
					res2++;
			}
		}
		if (res1 > res2)
			cout << "Player 1";
		if (res1 == res2)
			cout << "TIE";
		if (res1 < res2)
			cout << "Player 2";
		cout << "\n";
	}
	return 0;
}