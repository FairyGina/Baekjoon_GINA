#include<iostream>
using namespace std;
int main() {
	long long a, b, c;
	cin >> a >> b >> c;
	if (a / c == 0) a += 1;
	if (b / c == 0) b += 1;
	if ((a % c != 0) && (b % c != 0))
		cout << (a / c) * (b / c) + a / c + b / c + 1;
	else if ((a % c != 0) && (b % c == 0))
		cout << (a / c) * (b / c) + b / c;
	else if ((a % c == 0) && (b % c != 0))
		cout << (a / c) * (b / c) + a / c;
	else cout << (a / c) * (b / c);

	return 0;
}