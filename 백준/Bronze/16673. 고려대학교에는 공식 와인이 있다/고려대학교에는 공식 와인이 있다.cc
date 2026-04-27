#include<iostream>
using namespace std;
int main() {
	int c, k, p, res = 0;
	cin >> c >> k >> p;
	for (int i = 1; i <= c; i++) {
		res = res + i * (k + p * i);
	}
	cout << res;
	return 0;
}