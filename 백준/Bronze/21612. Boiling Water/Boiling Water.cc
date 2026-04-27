#include<iostream>
using namespace std;
int main() {
	int b, c;
	cin >> b;
	c = 5 * b - 400;
	cout << c << endl;
	if (c > 100)
		cout << -1;
	else if (c == 100)
		cout << 0;
	else
		cout << 1;
	return 0;
}