#include<iostream>
using namespace std;
int main() {
	long long s[5] = { 0 };
	for (int i = 0; i < 4; i++)
		cin >> s[i];
	cout << (((s[0] * s[2]) % (s[1] * s[3] * 2) == 0));

	return 0;
}