#include<iostream>
using namespace std;
int main() {
	int n, res = 0;
	cin >> n;
	while (1) {
		if (n == 1)
			break;
		if (n % 2 == 1)
			n = 3 * n + 1;
		else
			n /= 2;
		res++;
	}
	cout << res + 1;
	return 0;
}