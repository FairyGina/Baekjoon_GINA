#include<iostream>
#include<cmath>
using namespace std;
int main() {
	unsigned int s[5] = { 0 };
	unsigned int a[5] = { 0 };
	unsigned int min = 1000;
	for (int i = 0; i < 4; i++) {
		cin >> s[i];
	}
	a[0] = s[0];
	a[1] = s[1];
	a[2] = s[2] - s[0];
	a[3] = s[3] - s[1];
	for (int i = 0; i < 4; i++) {
		if (a[i] < min)
			min = a[i];
	}
	cout << min;

	return 0;
}