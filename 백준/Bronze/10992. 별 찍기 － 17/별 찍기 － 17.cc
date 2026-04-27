#include<iostream>
using namespace std;
int main() {
	int n;
	cin >> n;
	for (int i = 0; i < n; i++) {
		for (int j = n - 1; j > i; j--)
			cout << " ";
		if (i == 0)
			cout << "*" << "\n";
		else if (i == (n - 1)) {
			for (int k = 1; k < n * 2; k++)
				cout << "*";
		}
		else {
			cout << "*";
			for (int k = 1; k < 2 * i; k++)
				cout << " ";
			cout << "*" << "\n";
		}
	}
	return 0;
}