#include<iostream>
using namespace std;
int main() {
	short a, res1 = 0;
	for (int i = 0; i < 3; i++) {
		cin >> a;
		if (a == 1)
			res1++;
	}
	if (res1 > 1)
		cout << 1;
	else
		cout << 2;
	return 0;
}