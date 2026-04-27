#include<iostream>
using namespace std;
int main() {
	int a[3];
	int max = 0, min = 100;
	for (int i = 0; i < 3; i++) {
		cin >> a[i];
		if (max < a[i])
			max = a[i];
		if (min > a[i])
			min = a[i];
	}
	cout << a[0] + a[1] + a[2] - max - min;
	return 0;
}