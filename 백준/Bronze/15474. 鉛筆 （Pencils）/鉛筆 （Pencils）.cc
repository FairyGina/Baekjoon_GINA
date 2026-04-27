#include<iostream>
using namespace std;
int set(int n, int x) {
	if (n % x != 0)
		return n / x + 1;
	else
		return n / x;
}
int main() {
	int a, b, c, d, e, q, w;
	cin >> a >> b >> c >> d >> e;
	b = set(a, b) * c;
	d = set(a, d) * e;
	if (b > d) {
		cout << d;
	}
	else
		cout << b;
	return 0;
}