#include<iostream>
using namespace std;
int main() {
	int a, b;
	cin >> a >> b;
	if ((a + b) % 12 == 0)
		cout << 12;
	else
		cout << (a + b) % 12;
	return 0;
}