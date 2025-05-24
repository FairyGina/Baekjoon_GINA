#include<iostream>
using namespace std;
int num(int i) {
	return i * 3 - 1;
}
int main() {
	long long n, res, rres = 0;
	cin >> n;
	for (int i = 1; i <= n; i++) {
		res = 0;
		rres += num(i);
	}
	cout << (rres + 2 * n + 1) % 45678;
	return 0;
}