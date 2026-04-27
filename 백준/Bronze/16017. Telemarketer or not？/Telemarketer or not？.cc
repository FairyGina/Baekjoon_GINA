#include<iostream>
using namespace std;
int main() {
	int a, b, c, d, res = 0;
	cin >> a >> b >> c >> d;
	if (a == 8 || a == 9) {
		if (d == 8 || d == 9) {
			if (b == c)
				res++;
		}
	}
	if (res == 1)
		cout << "ignore";
	else
		cout << "answer";
	return 0;
}