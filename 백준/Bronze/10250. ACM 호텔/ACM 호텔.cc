#include<iostream>
using namespace std;
int main() {
	int t, h, w=0;
	int s[4] = { 0 };
	cin >> t;
	for (int i = 0; i < t; i++) {
		for (int j = 0; j < 3; j++)
			cin >> s[j];
		h = s[2] % s[0] * 100;
		w = s[2] / s[0];
		if (h == 0)
			h = s[0] * 100;
		else
			h++;
		cout << h + w << "\n";
	}
	return 0;
}