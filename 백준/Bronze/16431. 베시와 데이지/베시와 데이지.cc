#include<iostream>
#include<cmath>
using namespace std;
int main() {
	int x[7] = { 0 };
	int bx=0, by=0, dx, dy;
	for (int i = 0; i < 6; i++)
		cin >> x[i];
	dx = abs(x[2] - x[4]);
	dy = abs(x[3] - x[5]);
	
	if (abs(x[0] - x[4]) >= abs(x[1] - x[5])) {
		bx = abs(x[0] - x[4]);
	}
	else {
		by = abs(x[1] - x[5]);
	}
	if ((dx + dy) > (abs(bx) + abs(by)))
		cout << "bessie";
	if ((dx + dy) == (abs(bx) + abs(by)))
		cout << "tie";
	if ((dx + dy) < (abs(bx) + abs(by)))
		cout << "daisy";

	return 0;
}