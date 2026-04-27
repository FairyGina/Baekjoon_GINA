#include<iostream>
using namespace std;
int main() {
	int n, p, q, p1 = 100, q1 = 100;
	cin >> n;
	for (int i = 0; i < n; i++) {
		cin >> p >> q;
		if (p < q)
			p1 -= q;
		if (p > q)
			q1 -= p;
	}
	cout << p1 << "\n" << q1;
	return 0;
}