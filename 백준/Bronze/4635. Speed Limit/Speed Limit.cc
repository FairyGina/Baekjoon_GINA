#include<iostream>
using namespace std;
int main() {
	cin.sync_with_stdio(false);
	cin.tie(nullptr);
	int n, res, s, t, tm;
	while (1) {
		res = 0, tm = 0;
		cin >> n;
		if (n == -1)
			break;
		for (int i = 0; i < n; i++) {
			cin >> s >> t;
			res += s * (t - tm);
			tm = t;
		}
		cout << res << " miles" << endl;

	}
	return 0;
}