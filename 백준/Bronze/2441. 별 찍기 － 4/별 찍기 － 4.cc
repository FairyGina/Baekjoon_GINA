#include<iostream>
using namespace std;
int main() {
	int n, j, h;
	cin >> n;
	for (int i = 0; i < n; i++) {
		for (j = 0; j < i; j++)
			cout << " ";
		for (h = n; h > i; h--)
			cout << "*";
		cout << "\n";
	}
	return 0;
}