#include<iostream>
using namespace std;
int main() {
	int k, n, t, boom = 0;
	char z;
	cin >> k >> n;
	for (int i = 0; i < n; i++) {
		cin >> t >> z;
		if (boom + t > 210)
			break;
		else
			boom += t;
		if (z == 'T') {
			k++;
			if (k > 8)
				k = 1;
		}
	}
	cout << k;
	return 0;
}