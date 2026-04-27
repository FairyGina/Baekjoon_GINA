#include<iostream>
using namespace std;
int main() {
	int x1[5] = { 0 };
	for (int i = 0; i < 4; i++) {
		cin >> x1[i];
	}
	if ((x1[1] + x1[2]) <= (x1[0] + x1[3]))
		cout << x1[1] + x1[2];
	else
		cout << x1[0] + x1[3];
	
	return 0;
}