#include<iostream>
using namespace std;
int main() {
	int n, w, h, match;
	cin >> n >> w >> h;
	for (int i = 0; i < n; i++) {
		cin >> match;
		if (match * match > w * w + h * h)
			cout << "NE" << "\n";
		else
			cout << "DA" << "\n";
	}
	return 0;
}