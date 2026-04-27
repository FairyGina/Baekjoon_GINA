#include<iostream>
using namespace std;
int m(int n) {
	return n * n * n * n * n;
}
int main() {
	int n, n10000, n1000, n100, n10, n1;
	cin >> n;
	n10000 = n / 10000;
	n1000 = (n - n10000 * 10000) / 1000;
	n100 = (n - n10000 * 10000 - n1000 * 1000) / 100;
	n10 = (n - n10000 * 10000 - n1000 * 1000 - n100 * 100) / 10;
	n1 = n - n10000 * 10000 - n1000 * 1000 - n100 * 100 - n10 * 10;
	cout << m(n10000) + m(n1000) + m(n100) + m(n10) + m(n1);
	return 0;
}