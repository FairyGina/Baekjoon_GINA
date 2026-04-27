#include<iostream>
using namespace std;
int main() {
	int t, n, num, min;
	cin >> t;
	for (int i = 0; i < t; i++) {
		min = 100;
		num = 0;
		for (int j = 0; j < 7; j++) {
			cin >> n;
			if (n % 2 == 0) {
				num += n;
				if (n < min)
					min = n;
			}
		}
		cout << num << " " << min << "\n";
	}
	return 0;
}