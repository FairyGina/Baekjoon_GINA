#include<iostream>
using namespace std;
int main() {
	unsigned int s[3] = { 0 };
	unsigned int a, max, res;
	int i;
	while (1) {
		max = 0, res = 0;
		for (i = 0; i < 3; i++) {
			cin >> s[i];
			if (s[i] > max) {
				max = s[i];
				a = i;
			}
			res = res + s[i] * s[i];
		}
		if (max == 0)
			break;
		else {
			res = res - max * max;
			if (res == max * max)
				cout << "right" << "\n";
			else
				cout << "wrong" << "\n";
		}
	}
	return 0;
}