#include<iostream>
using namespace std;
int main() {
	unsigned int n1, n2;
	while (1) {
		cin >> n1 >> n2;
		if ((n1 == 0) && (n2 == 0))
			break;
		else {
			if (n1 > n2) {
				if (n1 % n2 == 0)
					cout << "multiple";
				else
					cout << "neither";
			}
			if (n1 < n2) {
				if (n2 % n1 == 0)
					cout << "factor";
				else
					cout << "neither";
			}
		}
		cout << "\n";
	}
	return 0;
}