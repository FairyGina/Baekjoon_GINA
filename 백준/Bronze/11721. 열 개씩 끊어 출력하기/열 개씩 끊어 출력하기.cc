#include <iostream>
#include<string>
using namespace std;
int main() {
	cin.sync_with_stdio(false);
	cin.tie(nullptr);
	string a;
	cin >> a;
	for (int i = 1; i <= a.length(); i++) {
		cout << a[i - 1];
		if (i % 10 == 0)
			cout << "\n";
	}
	return 0;
}