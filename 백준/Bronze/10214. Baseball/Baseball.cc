#include<iostream>
using namespace std;
int main() {
	int t, y, k, yres = 0, kres = 0;
	cin >> t;
	for (int j = 0; j < t; j++) {
		yres = 0, kres = 0;
		for (int i = 0; i < 9; i++) {
			cin >> y >> k;
			yres += y;
			kres += k;
		}
		if (yres > kres)
			cout << "Yonsei";
		if (yres == kres)
			cout << "Draw";
		if (yres < kres)
			cout << "Korea";
		cout << "\n";
	}
	return 0;
}