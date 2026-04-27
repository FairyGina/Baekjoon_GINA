#include<iostream>
using namespace std;
int f(int j, int rres) {
	for (int k = 1; k <= j + 1; k++)
		rres += k;
	return rres;
}
int main(){
	int t, n, res = 0, rres = 0;
	cin >> t;
	for (int i = 0; i < t; i++) {
		res = 0, rres = 0;
		cin >> n;
		for (int j = 1; j <= n; j++) {
			res += j * f(j, rres);
		}
		cout << res << endl;
	}
	return 0;
}