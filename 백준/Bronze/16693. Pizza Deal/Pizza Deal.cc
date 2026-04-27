#include<iostream>
#include<cmath>
using namespace std;
int main() {
	double a1, p1, r1, p2, pi, a, b;
	cin >> a1 >> p1 >> r1 >> p2;
	pi = acos(-1) * r1 * r1 / p2;
	a = a1 / p1;
	if (a > pi)
		cout << "Slice of pizza";
	else
		cout << "Whole pizza";

	return 0;
}