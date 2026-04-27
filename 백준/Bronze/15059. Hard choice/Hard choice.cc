#include<iostream>
using namespace std;
int main() {
	int a[4] = { 0 };
	int b[4] = { 0 };
	int c, res = 0;
	for (int i = 0; i < 3; i++)
		cin >> a[i];
	for (int i = 0; i < 3; i++)
		cin >> b[i];
	for (int i = 0; i < 3; i++) {
		c = a[i] - b[i];
		if (c < 0)
			res += -c;
	}
	cout << res;

	return 0;
}