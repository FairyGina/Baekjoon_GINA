#include<iostream>
using namespace std;
int main() {
	unsigned int t, n, n2, nn, nn2;
	bool yn;
	cin >> t;
	for (int i = 0; i < t; i++) {
		cin >> n;
		n2 = n * n;
		while (1) {
			nn2 = n2 % 10, nn = n % 10;
			if (nn2 != nn) {
				yn = 0;
				break;
			}
			n2 /= 10, n /= 10;
			if (n == 0) {
				yn = 1;
				break;
			}
		}
		if (yn == 0)
			cout << "NO" << endl;
		else
			cout << "YES" << endl;
	}
	return 0;
}