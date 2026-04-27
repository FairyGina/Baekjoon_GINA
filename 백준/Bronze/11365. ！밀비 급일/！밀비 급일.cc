#include <iostream>
#include<string>
#include<algorithm>
using namespace std;
int main() {
	cin.sync_with_stdio(false);
	cin.tie(nullptr);
	string a;
	while (1) {
		getline(cin, a);
		if (a == "END")
			break;
		reverse(a.begin(), a.end());
		cout << a << endl;
	}
	return 0;
}