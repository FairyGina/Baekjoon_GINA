#include<iostream>
using namespace std;
int main() {
	int n, y, m, res1 = 0, res2 = 0;
	int s[21] = { 0 };
	cin >> n;
	for (int i = 0; i < n; i++) {
		cin >> s[i];
		y = s[i] / 30 + 1;
		m = s[i] / 60 + 1;
		res1 += y;
		res2 += m;
	}
	if (res1 * 10 > res2 * 15)
		cout << "M " << res2 * 15;
	if (res1 * 10 == res2 * 15)
		cout << "Y M " << res1 * 10;
	if (res1 * 10 < res2 * 15)
		cout << "Y " << res1 * 10;
	
	return 0;
}