#include <iostream>
using namespace std;
int main() {
	cin.sync_with_stdio(false);
	cin.tie(nullptr);
	long long x, n, a, b, res = 0;
	cin >> x >> n;
	for (int i = 0; i < n; i++) {
		cin >> a >> b;
		res += a*b;
	}
	if (res == x)
		cout << "Yes";
	else
		cout << "No";
	return 0;
}