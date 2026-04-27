#include<iostream>
using namespace std;
int main() {
	unsigned int n, i;
	int s[45] = { 0 };
	s[1] = 1;
	cin >> n;
	for (i = 2; i <= n; i++) {
		s[i] = s[i - 1] + s[i - 2];
	}
	cout << s[n];
	return 0;
}