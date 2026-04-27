#include<iostream>
using namespace std;
int main() {
	long long a, b, c;
	cin >> a >> b >> c;
	if (a + b < 2 * c)
		cout << a + b;
	else
		cout << a + b - 2 * c;
	return 0;
}