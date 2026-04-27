#include<iostream>
using namespace std;
int main() {
	long long n, m;
	cin >> n >> m;
	if ((n % 2 == 1) && (m % 2 == 1))
		cout << ((n * m) - 1) / 2;
	else
		cout << ((n * m)/2);

	return 0;
}