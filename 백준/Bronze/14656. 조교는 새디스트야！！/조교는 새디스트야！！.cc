#include<iostream>
using namespace std;
int main() {
	int n, res = 0;
	int s = 0;
	cin >> n;
	for (int i = 1; i <= n; i++) {
		cin >> s;
		if (i != s)
			res++;
	}
	cout << res;
	return 0;
}