#include<iostream>
using namespace std;
int main() {
	int cup1, cup2, res;
	cin >> cup1 >> cup2;
	res = cup1 * 8 + cup2 * 3 - 28;
	if (res > 0)
		cout << res;
	else
		cout << 0;
	
	return 0;
}