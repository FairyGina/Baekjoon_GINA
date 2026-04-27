#include<iostream>
#include<algorithm>
using namespace std;
int main() {
	int n[4];
	int change;
	for (int i = 0; i < 4; i++) 
		cin >> n[i];
	sort(n, n + 4);
	cout << n[0] * n[2];
	return 0;
}