#include <iostream>
using namespace std;
int main() {
	int a, b, c, res = 0, i = 0;
	cin >> a >> b >> c;
	while (1) {
		i++;
		res += a;
		if (i % 7 == 0)
			res += b;
		if (res >= c)
			break;
	}
	cout << i;
	return 0;
}