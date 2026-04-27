#include <iostream>
#include <string>
using namespace std;
int main() {
	int n,m;
	string a;
	cin >> n >> m;
	for (int i = 0; i < n; i++) {
		cin >> a;
		for (int j = m - 1; j > -1; j--)
			cout << a[j];
		cout << "\n";
	}
	return 0;
}