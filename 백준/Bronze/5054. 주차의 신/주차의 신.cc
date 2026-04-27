#include<iostream>
#include<cmath>
using namespace std;
int store(int n) {
	int max = 0, min = 100;
	int x[100];
	for (int i = 0; i < n; i++) {
		cin >> x[i];
		if (x[i] > max)
			max = x[i];
		if (x[i] < min)
			min = x[i];
	}
	return 2 * (max - min);
}
int main() {
	cin.sync_with_stdio(false);
	cin.tie(nullptr);
	int t, n;
	cin >> t;
	for (int i = 0; i < t; i++) {
		cin >> n;
		cout << store(n) << endl;
	}
	return 0;
}