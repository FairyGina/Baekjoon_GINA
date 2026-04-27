#include<iostream>
using namespace std;
int main() {
	int t, n;
	cin >> t;
	while (1) {
		cin >> n;
		if (n == 0)
			break;
		else {
			if (n % t == 0)
				cout << n << " is a multiple of " << t << ".\n";
			else
				cout << n << " is NOT a multiple of " << t << ".\n";
		}
	}
	return 0;
}