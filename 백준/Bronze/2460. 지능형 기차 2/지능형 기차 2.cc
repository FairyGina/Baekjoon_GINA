#include<iostream>
using namespace std;
int main() {
	int d, u, res = 0, max = 0;
	for (int i = 0; i < 10; i++) {
		cin >> d >> u;
		res = res + u - d;
		if (res > max)
			max = res;
	}
	cout << max;
	return 0;
}