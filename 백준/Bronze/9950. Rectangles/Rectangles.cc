#include <iostream>
using namespace std;
int main() {
	int a, b, c;
	while (1) {
		cin >> a >> b >> c;
		if (a + b + c == 0)
			break;
		else {
			if (a == 0)
				cout << c / b << " " << b << " " << c << "\n";
			if (b == 0)
				cout << a << " " << c / a << " " << c << "\n";
			if (c == 0)
				cout << a << " " << b << " " << a*b << "\n";
		}
	}
	return 0;
}