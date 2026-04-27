#include<iostream>
using namespace std;
int main() {
	long long i;
	int n, a, b, ares = 0, bres = 0;
	cin >> n;
	for (i = 0; i < n; i++) {
		cin >> a >> b;
		if (a > b)
			ares++;
		if (a < b)
			bres++;
	}
	cout << ares << " " << bres;
	return 0;
}