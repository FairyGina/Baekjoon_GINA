#include <iostream>
#include<string>
using namespace std;
int main() {
	cin.sync_with_stdio(false);
	cin.tie(nullptr);
	string a, b;
	cin >> a >> b;
	if (a.length() >= b.length())
		cout << "go";
	else
		cout << "no";
	return 0;
}