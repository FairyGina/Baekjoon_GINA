#include<iostream>
using namespace std;
int main() {
	int m, x, y, res = 1;
	cin >> m;
	for (int i = 0; i < m; i++) {
		cin >> x >> y;
		if (x == res)
			res = y;
		else if (y == res)
			res = x;
	}
	if ((res == 1) || (res == 2) || (res == 3))
		cout << res;
	else
		cout << "-1";
	return 0;
}