#include<iostream>
using namespace std;
int main() {
	long long n, s;
	int n10, repeat, res = 0, i = 1;
	cin >> n;
	for (int i = 1; i <= n; i++) {
		s = i;
		if (s / 1000000 != 0)
			repeat = 7;
		else if (s / 100000 != 0)
			repeat = 6;
		else if (s / 10000 != 0)
			repeat = 5;
		else if (s / 1000 != 0)
			repeat = 4;
		else if (s / 100 != 0)
			repeat = 3;
		else if (s / 10 != 0)
			repeat = 2;
		else
			repeat = 1;
		for (int j = 0; j < repeat;j++) {
			n10 = s % 10;
			if (n10 != 0) {
				if (n10 % 3 == 0)
					res++;
			}
			s /= 10;
		}
	}
	cout << res;
	return 0;
}