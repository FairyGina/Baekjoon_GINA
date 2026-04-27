#include<iostream>
using namespace std;
int main() {
	cin.sync_with_stdio(false);
	cin.tie(nullptr);
	string a;
	cin >> a;
	if (a[0] == 'E')
		cout << 'I';
	else
		cout << 'E';
	if (a[1] == 'N')
		cout << 'S';
	else
		cout << 'N';
	if (a[2] == 'T')
		cout << 'F';
	else
		cout << 'T';
	if (a[3] == 'J')
		cout << 'P';
	else
		cout << 'J';
	return 0;
}