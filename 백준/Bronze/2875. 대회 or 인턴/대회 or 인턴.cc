#include<iostream>
using namespace std;
int main() {
	int n, m, k, i = 0;
	cin >> n >> m >> k;
	while (1) {
		if (((n - 2 * i) < 0)|| (m - i) < 0||((n - 2 * i) + (m - i) < k)) {
			cout << i - 1;
			break;
		}
		i++;
	}
	return 0;
}