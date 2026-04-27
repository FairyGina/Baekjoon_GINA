#include<iostream>
using namespace std;
int main() {
	int cap[8];
	int n, res;
	cin >> n;
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < 8; j++)
			cin >> cap[j];
		for (int i = 0; i < 4; i++) {
			cap[i] += cap[i + 4];
			if (i < 2) {
				if (cap[i] < 1)
					cap[i] = 1;
			}
			if (i == 2) {
				if (cap[i] < 0)
					cap[i] = 0;
			}
		}
		cout << cap[0] + cap[1] * 5 + cap[2] * 2 + cap[3] * 2 << "\n";
	}
	return 0;
}