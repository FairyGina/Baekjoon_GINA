#include<iostream>
using namespace std;
int main() {
	int t, n, num = 0, min = 100;
	for (int j = 0; j < 7; j++) {
		cin >> n;
		if (n % 2 != 0) {
			num += n;
			if (n < min)
				min = n;
		}
	}
	if (num == 0)
		cout << "-1";
	else
		cout << num << " " << min << "\n";
	return 0;
}