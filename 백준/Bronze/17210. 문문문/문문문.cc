#include<iostream>
using namespace std;
int main() {
	unsigned long long door, rule, i = 0;
	cin >> door >> rule;
	if (door > 5) {
		cout << "Love is open door";
	}
	else {
		while (1) {
			if (rule == 0) {
				cout << 1 << "\n";
				i++;
				rule = 1;
			}
			if (i == door-1)
				break;
			if (rule == 1) {
				cout << 0 << "\n";
				rule = 0;
				i++;
			}
			if (i == door-1)
				break;
		}
	}
	return 0;
}