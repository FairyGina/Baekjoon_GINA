#include<iostream>
using namespace std;
int main() {
	int n;
	string ox;
	cin >> n;
	for (int i = 0; i < n; i++) {
		int res = 0, Res = 0;
		cin >> ox;
		for (int j = 0; j < ox.size(); j++) {
			if (ox[j] == 'X') {
				res = 0;
			}
			else
				res++;
			Res += res;
		}
		cout << Res << "\n";
	}
	return 0;
}