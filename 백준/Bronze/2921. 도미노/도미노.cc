#include<iostream>
using namespace std;
int main() {
	int n, res = 0;
	cin >> n;
	for (int i = 0; i <= n; i++) {
		for (int j = i; j <= 2*i; j++) {
			res += j;
		}
	}
	cout << res;
	return 0;
}