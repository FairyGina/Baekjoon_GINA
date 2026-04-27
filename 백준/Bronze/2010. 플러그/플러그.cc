#include<iostream>
using namespace std;
int main() {
	int n, plug, res = 0;
	cin >> n;
	for (int i = 0; i < n; i++) {
		cin >> plug;
		res += plug;
	}
	cout << res - n + 1;
	return 0;
}