#include<iostream>
using namespace std;
int main() {
	int s, a, b, n;
	cin >> s >> a >> b;
	if (s - a < 0)
		cout << 250;
	else {
		if ((s - a) % b == 0)
			n = (s - a) / b;
		else
			n = (s - a) / b + 1;
		cout << 250 + 100 * n;
	}
	return 0;
}