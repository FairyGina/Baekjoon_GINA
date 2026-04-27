#include<iostream>
using namespace std;
int main() {
	int n, nn;
	cin >> n;
	for (int i = 0; i < n; i++) {
		cin >> nn;
		for (int j = 0; j < nn; j++)
			cout << '=';
		cout << "\n";
	}
	return 0;
}