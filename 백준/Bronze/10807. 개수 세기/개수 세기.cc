#include<iostream>
using namespace std;
int main() {
	int n, num[200], v, res = 0;
	cin >> n;
	for (int i = 0; i < n; i++)
		cin >> num[i];
	cin >> v;
	for (int i = 0; i < n; i++)
		if (num[i] == v)
			res++;
	cout << res;
	return 0;
}