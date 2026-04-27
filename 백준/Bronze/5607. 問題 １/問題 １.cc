#include<iostream>
using namespace std;
int main() {
	int n, a, b, resa = 0, resb = 0;
	cin >> n;
	for (int i = 0; i < n; i++) {
		cin >> a >> b;
		if (a > b)
			resa += a + b;
		else if (a < b)
			resb += a + b;
		else {
			resa += a;
			resb += b;
		}
	}
	cout << resa << " " << resb;
	return 0;
}