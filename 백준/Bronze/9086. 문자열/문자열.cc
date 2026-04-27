#include <iostream>
#include<string>
using namespace std;
int main() {
	cin.sync_with_stdio(false);
	cin.tie(nullptr);
	int t;
	string a;
	cin >> t;
	for (int i = 0; i < t; i++) {
		cin >> a;
		cout << a[0] << a[a.length() - 1] << endl;
	}
	return 0;
}