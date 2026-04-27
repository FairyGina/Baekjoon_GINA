#include<iostream>
using namespace std;
int main() {
	int n;
	int milk, store = 0, res = 0;
	cin >> n;
	for (int i = 0; i < n; i++) {
		cin >> milk;
		if (milk == store) {
			res++;
			store++;
			if (store == 3)
				store = 0;
		}
	}
	cout << res;
	return 0;
}