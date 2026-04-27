#include<iostream>
#include<cmath>
using namespace std;
int two(unsigned long long n) {
	bool t = true, f = false;
	while (n>1) {
		if (n % 2 == 0)
			n /= 2;
		else {
			return f;
			break;
		}
	}
	if (n == 1)
		return t;
}
int main() {
	cin.sync_with_stdio(false);
	cin.tie(nullptr);
	int q;
	unsigned long long a;
	cin >> q;
	for (int i = 0; i < q; i++) {
		cin >> a;
		cout << two(a) << "\n";
	}
	return 0;
}