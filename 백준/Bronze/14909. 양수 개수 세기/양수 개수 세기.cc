#include<iostream>
using namespace std;
int main() {
	int n, res = 0;
	while (true) {
		cin >> n;
		if (cin.eof() == true) {
			break;
		}
		if (n > 0)
			res++;
	}
	cout << res;
	return 0;
}