#include<iostream>
using namespace std;
int main() {
	int t, n, res;
	int number[100] = { 0 };
	cin >> t;
	for (int i = 0; i < t; i++) {
		res = 0;
		cin >> n;
		for (int j = 0; j < n; j++) {
			cin >> number[j];
			res += number[j];
		}
		cout << res << "\n";
	}
	return 0;
}