#include<iostream>
using namespace std;
int main() {
	int s[3] = { 0 };
	int max = 0, min = 101, res = 0;
	for (int i = 0; i < 3; i++) {
		cin >> s[i];
		if (max < s[i])
			max = s[i];
		if (min > s[i])
			min = s[i];
		res += s[i];
	}
	cout << res - max - min;
	return 0;
}