#include<iostream>
using namespace std;
int main() {
	int n, i = 1;
	while (1) {
		cin >> n;
		if (n == 0)
			break;
		if (n % 2 == 0)
			cout << i << ". even " << n / 2 << "\n";
		if (n % 2 == 1)
			cout << i << ". odd " << (n - 1) / 2 << "\n";
		i++;
	}

	return 0;
}