#include<iostream>
using namespace std;
int main() {
	int coffee[9] = { 100, 100, 200, 200, 300, 300, 400, 400, 500 };
	int number[9];
	int res1 = 0, res2 = 0;
	for (int i = 0; i < 9; i++) {
		cin >> number[i];
		res2 += number[i];
		if (number[i] > coffee[i])
			res1++;
	}
	if (res1 > 0)
		cout << "hacker";
	else {
		if (res2 >= 100)
			cout << "draw";
		if (res2 < 100)
			cout << "none";
	}
	return 0;
}