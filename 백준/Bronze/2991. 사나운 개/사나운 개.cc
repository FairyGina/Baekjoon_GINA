#include<iostream>
using namespace std;
int main() {
	int a, b, c, d;
	int u;
	cin >> a >> b >> c >> d;
	for (int i = 0; i < 3; i++) {
		int res = 0;
		cin >> u;
		if (u % (a + b) > 0 && u % (a + b) <= a)
			res++;
		if (u % (c + d) > 0 && u % (c + d) <= c)
			res++;
		cout << res << "\n";
	}
	return 0;
}