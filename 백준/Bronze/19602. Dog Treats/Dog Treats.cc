#include<iostream>
using namespace std;
int main() {
	int a, b, c;
	cin >> a >> b >> c;
	if ((a + 2 * b + 3 * c) >= 10)
		cout << "happy";
	else
		cout << "sad";
	return 0;
}