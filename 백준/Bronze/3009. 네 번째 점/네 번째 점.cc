#include<iostream>
using namespace std;
void xy(unsigned int x[]) {
	if (x[0] == x[1])
		cout << x[2] << " ";
	if (x[0] == x[2])
		cout << x[1] << " ";
	if (x[1] == x[2])
		cout << x[0] << " ";
}
int main() {
	unsigned int x[3] = { 0 };
	unsigned int y[3] = { 0 };
	for (int i = 0; i < 3; i++) {
		cin >> x[i] >> y[i];
	}
	xy(x);
	xy(y);
	return 0;
}