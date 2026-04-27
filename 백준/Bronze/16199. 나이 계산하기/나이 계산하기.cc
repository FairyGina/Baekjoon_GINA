#include<iostream>
using namespace std;
int main() {
	int bir[4] = { 0 };
	int pre[4] = { 0 };

	for (int i = 0; i < 3; i++)
		cin >> bir[i];
	for (int i = 0; i < 3; i++)
		cin >> pre[i];
	if (bir[1] == pre[1]) {
		if (bir[2] <= pre[2])
			cout << pre[0] - bir[0] << "\n";
		else
			cout << pre[0] - bir[0] - 1 << "\n";
	}
	if (bir[1] < pre[1])
		cout << pre[0] - bir[0] << "\n";
	if (bir[1] > pre[1])
		cout << pre[0] - bir[0] - 1 << "\n";
	cout << pre[0] - bir[0] + 1 << "\n";
	cout << pre[0] - bir[0];

	return 0;
}