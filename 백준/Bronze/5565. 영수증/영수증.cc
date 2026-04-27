#include<iostream>
using namespace std;
int main() {
	int n, s, res = 0;
	cin >> n;
	for (int i = 0; i < 9; i++) {
		cin >> s;
		res += s;
	}
	n -= res;
	cout << n;
	return 0;
}