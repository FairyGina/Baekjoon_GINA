#include<iostream>
using namespace std;
int main() {
	int n, t, request, res = 0;
	cin >> n >> t;
	for (int i = 0; i < n; i++) {
		cin >> request;
		if (t - request >= 0) {
			t -= request;
			res++;
		}
		else
			break;
	}
	cout << res;
	return 0;
}