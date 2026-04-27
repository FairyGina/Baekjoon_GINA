#include<iostream>
using namespace std;
int main() {
	int a, b, n, w, sheep, goat, res = 0;
	cin >> a >> b >> n >> w;
	for (int i = 1; i <= n; i++) {
		if (a * i + b * (n - i) == w) {
			if (n - i > 0) {
				sheep = i;
				goat = n - i;
				res++;
			}
		}
	}
	if ((res == 0) || (res > 1))
		cout << -1;
	else
		cout << sheep << " " << goat;
	return 0;
}