#include<iostream>
using namespace std;
int main() {
	string a;
	cin >> a;
	if (a == "A+")
		cout << "4.3";
	if (a == "A0")
		cout << "4.0";
	if (a == "A-")
		cout << "3.7";
	if (a == "B+")
		cout << "3.3";
	if (a == "B0")
		cout << "3.0";
	if (a == "B-")
		cout << "2.7";
	if (a == "C+")
		cout << "2.3";
	if (a == "C0")
		cout << "2.0";
	if (a == "C-")
		cout << "1.7";
	if (a == "D+")
		cout << "1.3";
	if (a == "D0")
		cout << "1.0";
	if (a == "D-")
		cout << "0.7";
	if (a == "F")
		cout << "0.0";
	return 0;
}