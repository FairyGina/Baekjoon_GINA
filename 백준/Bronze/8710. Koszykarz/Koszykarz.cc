#include<iostream>
using namespace std;
int main() {
	long long a, b, c;
	cin >> a >> b >> c;
	if ((b - a) % c == 0)
		cout << (b - a) / c;
	else
		cout << (b - a) / c + 1;
	return 0;
}