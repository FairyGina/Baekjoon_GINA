#include<iostream>
using namespace std;
int main() {
	int t, money, quarter, dime, nickel, penny;
	cin >> t;
	for (int i = 0; i < t; i++) {
		cin >> money;
		quarter = money / 25;
		dime = (money - quarter * 25) / 10;
		nickel = (money - quarter * 25 - dime * 10) / 5;
		penny = money - quarter * 25 - dime * 10 - nickel * 5;
		cout << quarter << " " << dime << " " << nickel << " " << penny << "\n";
	}
	return 0;
}