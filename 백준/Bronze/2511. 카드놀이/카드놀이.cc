#include<iostream>
using namespace std;
int main() {
	int a[10];
	int b[10];
	int i, ares = 0, bres = 0;
	char winner = 'D';
	for (i = 0; i < 10; i++)
		cin >> a[i];
	for (i = 0; i < 10; i++)
		cin >> b[i];
	for (i = 0; i < 10; i++) {
		if (a[i] > b[i]) {
			ares += 3;
			winner = 'A';
		}
		if (a[i] == b[i]) {
			ares++;
			bres++;
		}
		if (a[i] < b[i]) {
			bres += 3;
			winner = 'B';
		}
	}
	if (ares > bres)
		winner = 'A';
	if (ares < bres)
		winner = 'B';
	cout << ares << " " << bres << "\n" << winner;
	return 0;
}