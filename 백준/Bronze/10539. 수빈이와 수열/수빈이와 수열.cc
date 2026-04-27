#include<iostream>
using namespace std;
int main() {
	int number[101] = { 0 };
	int save[101] = { 0 };
	int n;
	cin >> n;
	for (int i = 1; i <= n; i++) {
		cin >> number[i];
		save[i - 1] = i * number[i];
	}
	for (int i = 1; i <= n; i++) {
		number[i] = save[i] - save[i - 1];
	}
	cout << save[0] << " ";
	for (int i = 1; i < n; i++)
		cout << number[i] << " ";
	return 0;
}