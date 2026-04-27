#include<iostream>
using namespace std;
int main() {
	double r;
	cin >> r;
	cout << fixed;
	cout.precision(6);
	cout.setf(ios::showpoint);
	cout << r * r * 3.1415926535897 << "\n" << 2 * r * r;
	return 0;
}