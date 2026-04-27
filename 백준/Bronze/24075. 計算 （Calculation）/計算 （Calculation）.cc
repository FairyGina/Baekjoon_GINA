#include<iostream>
using namespace std;
int main() {
	int a, b;
	cin >> a >> b;
	if (a + b > a - b)
		cout << a + b << "\n" << a - b;
	else
		cout << a - b << "\n" << a + b;
	return 0;
}