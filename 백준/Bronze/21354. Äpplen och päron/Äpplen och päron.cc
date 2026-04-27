#include<iostream>
#include<cmath>
using namespace std;
int main() {
	cin.sync_with_stdio(false);
	cin.tie(nullptr);
	int a, b;
	cin >> a >> b;
	if (7 * a < 13 * b)
		cout << "Petra";
	else if (7 * a > 13 * b)
		cout << "Axel";
	else
		cout << "lika";
	return 0;
}