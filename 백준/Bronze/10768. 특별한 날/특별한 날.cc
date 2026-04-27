#include<iostream>
using namespace std;
int main() {
	int month, day;
	cin >> month >> day;
	if (month < 2)
		cout << "Before";
	if (month > 2)
		cout << "After";
	if (month == 2) {
		if (day == 18)
			cout << "Special";
		if (day < 18)
			cout << "Before";
		if (day > 18)
			cout << "After";
	}
	return 0;
}