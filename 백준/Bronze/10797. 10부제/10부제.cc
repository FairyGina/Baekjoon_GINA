#include<iostream>
using namespace std;
int main() {
	int n, res =0;
	int car[6] = {0};
	cin >> n;
	for (int i = 0; i < 5; i++) {
		cin >> car[i];
		if (car[i] == n)
			res++;
	}
	cout << res;
	
	return 0;
}