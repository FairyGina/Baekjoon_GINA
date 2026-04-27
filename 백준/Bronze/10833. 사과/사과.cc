#include<iostream>
using namespace std;
int main() {
	unsigned int n, s, a, res = 0;
	cin >> n;
	for (int i = 0; i < n; i++) {
		cin >> s >> a;
		res += a % s;
	}
	cout << res;
	return 0;
}