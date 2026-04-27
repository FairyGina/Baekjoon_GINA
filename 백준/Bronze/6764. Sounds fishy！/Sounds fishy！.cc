#include<iostream>
using namespace std;
int main() {
	int reading, R, r = 0, s = 0, v = 0;
	cin >> R;
	for (int i = 0; i < 3; i++) {
		cin >> reading;
		if (reading > R) {
			R = reading;
			r++;
		}
		else if (reading < R) {
			R = reading;
			s++;
		}
		else if (reading == R) {
			R = reading;
			v++;
		}
	}
	if (r == 3)
		cout << "Fish Rising";
	else if (s == 3)
		cout << "Fish Diving";
	else if (v == 3)
		cout << "Fish At Constant Depth";
	else
		cout << "No Fish";
	return 0;
}