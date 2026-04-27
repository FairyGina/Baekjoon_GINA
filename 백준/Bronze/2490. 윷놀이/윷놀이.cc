#include<iostream>
using namespace std;
int main() {
	unsigned int s[4] = { 0 };
	unsigned int res;
	for (int i = 0; i < 3; i++) {
		res = 0;
		for (int j = 0; j < 4; j++) {
			cin >> s[j];
			if (s[j] == 0)
				res++;
		}
		if (res == 1)
			cout << "A" << "\n";
		else if (res == 2)
			cout << "B" << "\n";
		else if (res == 3)
			cout << "C" << "\n";
		else if (res == 4)
			cout << "D" << "\n";
		else if (res == 0)
			cout << "E" << "\n";
	}
	return 0;
}