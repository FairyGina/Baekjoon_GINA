#include<iostream>
using namespace std;
int main() {
	int t, res = 0;
	int c[6] = { 0 };
	cin >> t;
	for (int i = 0; i < 5; i++) {
		cin >> c[i];
		if (c[i] == t)
			res++;
	}
	cout << res;
	return 0;
}