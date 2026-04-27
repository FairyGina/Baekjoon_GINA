#include<iostream>
using namespace std;
int main() {
	long long n, m, n1, n2, m1, m2;
	cin >> n >> m;
	if ((n % 2 != 0) && (m % 2 != 0)) {
		if (n >= m)
			cout << m;
		else
			cout << n;
	}
	else {
		if ((n % 2 == 0) || (m % 2 == 0))
			cout << "0";
		else
			cout << "0";
	}

	return 0;
}