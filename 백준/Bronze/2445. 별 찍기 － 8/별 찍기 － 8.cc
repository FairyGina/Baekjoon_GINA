#include<iostream>
#include<cmath>
using namespace std;
int main() {
	int n;
	cin >> n;
	for (int i = 1; i <= n; i++) {
		for (int j = 0; j < i; j++) {
			cout << "*";
		}
		for (int k = n; k > i; k--) {
			cout << " ";
		}
		for (int k = n; k > i; k--) {
			cout << " ";
		}
		for (int j = 0; j < i; j++) {
			cout << "*";
		}
		cout << "\n";
	}
	for (int i = 1; i < n; i++) {
		for (int j = n; j > i; j--) {
			cout << "*";
		}
		for (int k = 0; k < i; k++) {
			cout << " ";
		}
		for (int k = 0; k < i; k++) {
			cout << " ";
		}
		for (int j = n; j > i; j--) {
			cout << "*";
		}
		cout << "\n";
	}
	return 0;
}