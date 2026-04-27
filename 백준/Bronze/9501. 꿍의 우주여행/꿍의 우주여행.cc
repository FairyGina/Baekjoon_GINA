#include<iostream>
using namespace std;
int main(){
	int t, n, res;
	double d, v, f, c;
	cin >> t;
	for (int i = 0; i < t; i++) {
		res = 0;
		cin >> n >> d;
		for (int j = 0; j < n; j++) {
			cin >> v >> f >> c;
			if (d / v <= f / c)
				res++;	
		}
		cout << res << endl;
	}
	return 0;
}