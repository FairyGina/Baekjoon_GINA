#include <iostream>
using namespace std;
int add(int a, int i) {
	int ares = 0;
	for (int j = 1; j <= a + i; j++)
		ares += j;
	return ares;
}
int main() {
	cin.sync_with_stdio(false);
	cin.tie(nullptr);
	int a, b, res = 1;
	cin >> a >> b;
	for (int i = 0; i <= b - a; i++) {
		res = res * add(a, i) % 14579;
	}
	cout << res;
	cin >> a;
	return 0;
}