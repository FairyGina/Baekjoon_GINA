#include<iostream>
using namespace std;
int main() {
	int age[4];
	while (1) {
		for (int i = 0; i < 4; i++)
			cin >> age[i];
		if ((age[0] == 0) && (age[1] == 0) && (age[2] == 0) && (age[3] == 0))
			break;
		cout << age[2] - age[1] << " " << age[3] - age[0] << "\n";
	}
	return 0;
}