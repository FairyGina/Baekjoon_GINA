#include<iostream>
using namespace std;
int main() {
	int n, answer;
	cin >> n;
	for (int i = 0; i < n; i++) {
		cin >> answer;
		if (answer == 1)
			cout << "#\n\n";
		else {
			for (int k = 0; k < answer; k++) {
				cout << "#";
			}
			cout << "\n";
			for (int k = 0; k < answer - 2; k++) {
				cout << "#";
				for (int l = 0; l < answer - 2; l++) {
					cout << "J";
				}
				cout << "#\n";
			}
			for (int k = 0; k < answer; k++) {
				cout << "#";
			}
			cout << "\n\n";
		}
	}

	return 0;
}