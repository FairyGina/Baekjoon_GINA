#include<iostream>
using namespace std;
int main() {
	int test[7] = { 0 };
	int min = 100, num = 0;
	for (int i = 0; i < 4; i++) {
		cin >> test[i];
		if (min > test[i]) {
			min = test[i];
		}
		num += test[i];
	}
	num -= min;
	min = 100;
	for (int i = 0; i < 2; i++) {
		cin >> test[i];
		if (min > test[i]) {
			min = test[i];
		}
		num += test[i];
	}
	num -= min;
	cout << num;

	return 0;
}