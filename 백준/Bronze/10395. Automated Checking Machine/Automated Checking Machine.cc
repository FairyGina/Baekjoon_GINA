#include <iostream>
using namespace std;
int main() {
	bool a[5], b[5], res = 1;
	for (int i = 0; i < 5; i++) 
		cin >> a[i];
	for (int i = 0; i < 5; i++) {
		cin >> b[i];
		if (a[i] == b[i]) {
			res = 0;
			break;
		}
	}
	if (res == 0)
		cout << "N";
	else
		cout << "Y";
	cin >> a[1];
	return 0;
}