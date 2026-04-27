#include<iostream>
using namespace std;
int main() {
	int n, z=0, min = 1000000;
	int answer[3] = { 0 };
	int dir[1000000] = { 0 };
	cin >> n;
	for (int i = 1; i <= n; i++) {
		if (n % i == 0) {
			dir[z] = i;
			z++;
		}
	}
	for (int i = 0; i < z; i++) {
		for (int j = 0; j <= z; j++) {
			for (int k = 0; k < z; k++) {
				if (dir[i] * dir[j] * dir[k] == n) {
					if (dir[i] + dir[j] + dir[k] < min) {
						min = dir[i] + dir[j] + dir[k];
						answer[0] = dir[i];
						answer[1] = dir[j];
						answer[2] = dir[k];
					}
				}
			}
		}
	}
	for (int i = 0; i < 3; i++)
		cout << answer[i] << "\n";
	return 0;
}