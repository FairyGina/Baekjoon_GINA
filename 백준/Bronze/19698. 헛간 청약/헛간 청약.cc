#include<iostream>
using namespace std;
int main() {
	int s[5] = { 0 };
	for (int i = 0; i < 4; i++) {
		cin >> s[i];
	}
	if (((s[1] / s[3]) * (s[2] / s[3])) <= s[0])
		cout << (s[1] / s[3]) * (s[2] / s[3]);
	else cout << s[0];

	return 0;
}