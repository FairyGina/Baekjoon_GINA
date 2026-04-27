#include<iostream>
using namespace std;
int main() {
	int number[9][9];
	int max = 0, xmax=0, ymax=0;
	for (int i = 0; i < 9; i++) {
		for (int j = 0; j < 9; j++) {
			cin >> number[i][j];
			if (number[i][j] > max) {
				max = number[i][j];
				xmax = i;
				ymax = j;
			}
		}
	}
	cout << max << "\n" << xmax + 1 << " " << ymax + 1;
	return 0;
}