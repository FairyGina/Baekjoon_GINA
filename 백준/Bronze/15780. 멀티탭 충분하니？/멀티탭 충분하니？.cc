#include<iostream>
using namespace std;
int main() {
	int n, k, res = 0;
	int a[100] = { 0 };
	cin >> n >> k;
	for (int i = 0; i < k; i++) {
		cin >> a[i];
		if (a[i] % 2 == 0)
			res = res + a[i] / 2;
		else
			res = res + a[i] / 2 + 1;
	}
	if (res < n)
		cout << "NO";
	else
		cout << "YES";
	return 0;
}