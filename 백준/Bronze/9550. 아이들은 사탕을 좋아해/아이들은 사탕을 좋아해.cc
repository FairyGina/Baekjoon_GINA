#include<iostream>
using namespace std;
int main() {
	int t, n, k, candy, res;
	cin >> t;
	for (int i = 0; i < t; i++) {
		res = 0;
		cin >> n >> k;
		for (int j = 0; j < n; j++) {
			cin >> candy;
			res += candy / k;
		}
		cout << res << "\n";
	}
	return 0;
}