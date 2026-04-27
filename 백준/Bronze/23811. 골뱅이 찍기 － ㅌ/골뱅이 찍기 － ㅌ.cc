#include <iostream>
using namespace std;
void a(int n) {
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			for (int k = 0; k < 5; k++)
				cout << "@";
		}
		cout << "\n";
	}
}
void b(int n) {
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			cout << "@";
		}
		cout << "\n";
	}
}
int main() {
	int n;
	cin >> n;
	a(n);
	b(n);
	a(n);
	b(n);
	a(n);
	return 0;
}