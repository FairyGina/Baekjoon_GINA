#include<iostream>
using namespace std;
int main() {
	int a, b, c, m, work = 0, time = 0, out = 0;
	cin >> a >> b >> c >> m;
	if (a > m)
		cout << 0;
	else {
		for (int i = 0; i < 24; i++) {
			if (out + a > m) {
				if (out - c < 0)
					out = 0;
				else
					out -= c;
				time++;
			}
			else {
				out += a;
				time++;
				work += b;
			}
		}
		cout << work;
	}
	return 0;
}