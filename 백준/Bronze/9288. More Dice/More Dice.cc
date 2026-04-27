#include<iostream>
using namespace std;
int main() {
	int n, num;
	cin >> n;
	for (int i = 1; i <= n; i++) {
		cin >> num;
		cout << "Case " << i << ":" << endl;
		for (int j = 1; j <= num / 2; j++) {
			if (num - j < 7)
				cout << "(" << j << "," << num - j << ")" << endl;
		}
	}
	return 0;
}