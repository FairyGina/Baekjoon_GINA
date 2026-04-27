#include<iostream>
using namespace std;
int main() {
	int a, b, v, num = 0, i = 0;
	cin >> a >> b >> v;
	cout << (v - b - 1) / (a - b) + 1;
	return 0;
}