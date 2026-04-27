#include<iostream>
using namespace std;
int main() {
	int p, d;
	while (1) {
		cin >> p >> d;
		if (p + d == 0)
			break;
		int min = 80000, res;
		for (int i = 30, j = 40; i < 41; i += 5, j -= 10) {
			res = p * i + d * j;
			if (res < min)
				min = res;
		}
		cout << min << endl;
	}
	return 0;
}