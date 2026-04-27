#include<iostream>
using namespace std;
int main() {
	int l, r, a;
	cin >> l >> r >> a;
	int j = a;
	if (l > r) {
		for (int i = 0; i < j; i++) {
			r++;
			a--;
			if (l == r)
				break;
		}
		if (l > r)
			cout << r * 2 + a / 2;
		else
			cout << (r + a / 2) * 2;
	}
	else if (l < r) {
		for (int i = 0; i < j; i++) {
			l++;
			a--;
			if (r == l)
				break;
		}
		if (l < r)
			cout << l * 2 + a / 2;
		else
			cout << (l + a / 2) * 2;
	}
	else
		cout << (l + a / 2) * 2;
	return 0;
}