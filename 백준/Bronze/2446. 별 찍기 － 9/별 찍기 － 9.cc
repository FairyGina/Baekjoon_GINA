#include<iostream>
#include<cmath>
using namespace std;
int main() {
	int n;
	cin >> n;
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < i; j++) {
			cout << " ";
		}
		for (int k = n; k > i + 1; k--) {
			cout << "*";
		}
		for (int k = n; k > i; k--) {
			cout << "*";
		}
		cout << "\n";
	}
	for (int i = 0; i < n - 1; i++) {
		for (int j = n - 2; j > i; j--) {
			cout << " ";
		}
		for (int k = -1; k < i; k++) {
			cout << "*";
		}
		for (int k = -1; k < i + 1; k++) {
			cout << "*";
		}
		cout << "\n";
	}
	return 0;
}