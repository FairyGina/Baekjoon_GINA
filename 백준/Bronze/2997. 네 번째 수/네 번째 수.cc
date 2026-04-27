#include<iostream>
using namespace std;
int main() {
	int max = -100, min = 100, res = 0;
	int n[3];
	for (int i = 0; i < 3; i++) {
		cin >> n[i];
		if (n[i] > max)
			max = n[i];
		if (n[i] < min)
			min = n[i];
		res += n[i];
	}
	n[1] = res - min - max;
	n[0] = min;
	n[2] = max;
	if (n[2] - n[1] == n[1] - n[0])
		cout << n[2] * 2 - n[1];
	else {
		if (n[2] - n[1] > n[1] - n[0])
			cout << n[1] + n[1] - n[0];
		if (n[2] - n[1] < n[1] - n[0])
			cout << n[0] + n[2] - n[1];
	}
	return 0;
}