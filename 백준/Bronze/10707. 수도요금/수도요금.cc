#include<iostream>
using namespace std;
int main() {
	int sudo[5] = { 0 };
	int X, Y;
	for (int i = 0; i < 5; i++)
		cin >> sudo[i];
	X = sudo[0] * sudo[4];
	if (sudo[4] > sudo[2])
		Y = (sudo[4] - sudo[2]) * sudo[3] + sudo[1];
	else
		Y = sudo[1];
	if (X >= Y)
		cout << Y;
	else
		cout << X;

	return 0;
}