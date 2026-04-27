#include<iostream>
using namespace std;
int main() {
	int a, a100, a10, a1;
	cin >> a;
	a100 = a / 1000000;
	a10 = a / 100000 - a100 * 10;
	a1 = a / 10000 - a100 * 100 - a10 * 10;
	if ((a100 == 5) && (a10 == 5) && (a1 == 5))
		cout << "YES";
	else
		cout << "NO";
	return 0;
}