#include<iostream>
using namespace std;
int q(int x) {
	int a, max = 0;
	for (int i = 0; i < x; i++) {
		cin >> a;
		if (max < a)
			max = a;
	}
	return max;
}
int main() {
	int n, m;
	cin >> n >> m;
	cout << q(n) + q(m);
	return 0;
}