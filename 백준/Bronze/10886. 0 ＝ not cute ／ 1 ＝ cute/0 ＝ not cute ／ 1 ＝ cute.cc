#include<iostream>
using namespace std;
int main() {
	int n, ans, notcute = 0, cute = 0;
	cin >> n;
	for (int i = 0; i < n; i++) {
		cin >> ans;
		if (ans == 0)
			notcute++;
		else
			cute++;
	}
	if (notcute > cute)
		cout << "Junhee is not cute!";
	if (notcute < cute)
		cout << "Junhee is cute!";
	return 0;
}