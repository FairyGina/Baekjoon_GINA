#include<iostream>
#include<algorithm>
using namespace std;
int main() {
	int num[1000000] = { 0 };
	int n, temp, least;
	cin >> n;
	for (int i = 0; i < n; i++)
		cin >> num[i];
	sort(num, num + n);
	for (int i = 0; i < n; i++)
		cout << num[i] << "\n";
	return 0;
}