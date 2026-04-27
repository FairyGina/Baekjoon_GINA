#include<iostream>
#include<cmath>
using namespace std;
int main() {
	int ping[5] = { 0 };
	for (int i = 0; i < 4; i++) {
		cin >> ping[i];
	}
	cout << abs((ping[0] + ping[3]) - (ping[1] + ping[2]));

	return 0;
}