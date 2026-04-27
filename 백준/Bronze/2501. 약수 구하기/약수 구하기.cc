#include<iostream>
using namespace std;
int main() {
	int divisor[10000] = { 0 };
	int n, k, i, j = 0;
	cin >> n >> k;
	for (i = 1; i <= n; i++) {
		if (n % i == 0) {
			divisor[j] = i;
			j++;
		}
	}
	cout << divisor[k - 1];
	return 0;
}