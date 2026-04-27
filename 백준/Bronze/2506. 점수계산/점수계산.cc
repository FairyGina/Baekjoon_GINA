#include<iostream>
using namespace std;
int main() {
	int n, o, oo = 0, res = 0;
	cin >> n;
	for (int i = 0; i < n; i++) {
		cin >> o;
		if (o == 1)
			oo++;
		else
			oo = 0;
		res += oo;
	}
	cout << res;
	return 0;
}