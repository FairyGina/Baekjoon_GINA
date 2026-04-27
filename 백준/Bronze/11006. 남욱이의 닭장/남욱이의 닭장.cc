#include<iostream>
using namespace std;
int main() {
	int t, n, m, u, y;
	cin >> t;
	for (int i = 0; i < t; i++) {
		cin >> n >> m;
		u = 2 * m - n;
		y = m - u;
		cout << u << " " << y << "\n";
	}
	return 0;
}