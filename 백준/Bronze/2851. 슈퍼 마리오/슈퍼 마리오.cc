#include<iostream>
using namespace std;
int main() {
	int mushroom[10];
	int i, res = 0, answer = 0;
	for (i = 0; i < 10; i++)
		cin >> mushroom[i];
	i = 0;
	while (1) {
		if (res + mushroom[i] <= 100) {
			res += mushroom[i];
			answer = res;
		}
		else {
			if (100 - res < res + mushroom[i] - 100)
				res = answer;
			else
				res += mushroom[i];
			cout << res;
			break;
		}
		if (i > 9) {
			cout << res;
			break;
		}
		i++;
	}
	return 0;
}