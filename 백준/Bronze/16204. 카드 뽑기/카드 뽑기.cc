#include<iostream>
using namespace std;
int main() {
	int n, m, k, m1, k1, res = 0;
	cin >> n >> m >> k;
	m1 = n - m;
	k1 = n - k;
	if (m <= k)
		res += m;
	else res += k;
	if (m1 <= k1)
		res += m1;
	else res += k1;
	cout << res;

	return 0;
}