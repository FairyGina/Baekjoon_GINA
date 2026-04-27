#include<iostream>
#include<cmath>
using namespace std;
int main() {
	int meat[6];
	int i;
	for (i = 0; i < 5; i++) {
		cin >> meat[i];
	}
	if (meat[0] > 0) {
		cout << (meat[1] - meat[0]) * meat[4];
	}
	else
		cout << abs(meat[0] * meat[2]) + meat[3] + (meat[4] * meat[1]);

	return 0;
}