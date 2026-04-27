#include<iostream>
using namespace std;
int main() {
	int exam[3];
	int min = 100;
	for (int i = 0; i < 3; i++) {
		cin >> exam[i];
		if (min > exam[i])
			min = exam[i];
	}
	cout << exam[0] + exam[1] + exam[2] - min;
	return 0;
}