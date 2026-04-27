#include<iostream>
using namespace std;
int main() {
	int n, i, j, res1 = 0, res2 = 0, max1 = 0, max2 = 0;
	int fin1[5] = { 0 };
	int fin2[5] = { 0 };
	cin >> n;
	if (n == 1)
		cout << "1";
	else {
		for (i = 2; i <= n;) {
			for (j = 1; j < 5; j++) {
				if (i > n)
					break;
				fin1[j] = i;
				i++;
			}
			for (j = 3; j >= 0; j--) {
				if (i > n)
					break;
				fin2[j] = i;
				i++;
			}
		}
		for (i = 0; i < 5; i++) {
			if (fin1[i] > max1) {
				max1 = fin1[i];
				res1 = i;
			}
			if (fin2[i] > max1) {
				max1 = fin2[i];
				res2 = i+1;
			}
		}
		if (res1 >= res2)
			cout << res1+1;
		if (res1 < res2)
			cout << res2;
	}
	return 0;
}