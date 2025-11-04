#include<iostream>
using namespace std;
int main() {
	cin.sync_with_stdio(false);
	cin.tie(nullptr);
	unsigned long long t, n, num, res;
	cin >> t;
	for (int i = 0; i < t; i++) {
		res = 0;
		cin >> n;
		for (int j = 0; j < n; j++) {
			cin >> num;
			res = (res + num) % n;
		}
		if (res % n)
			cout << "NO" << endl;
		else
			cout << "YES" << endl;
	}
	return 0;
}