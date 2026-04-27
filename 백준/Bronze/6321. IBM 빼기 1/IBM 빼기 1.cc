#include <iostream>
#include<string>
using namespace std;
int main() {
	int t;
	string a;
	cin >> t;
	for (int i = 1; i <= t; i++) {
		cin >> a;
		cout << "String #" << i << "\n";
		for (int j = 0; j < a.length(); j++) {
			if (a[j] == 90)
				cout << 'A';
			else
				cout << char(a[j] + 1);
		}
		cout << "\n\n";
	}
	return 0;
}