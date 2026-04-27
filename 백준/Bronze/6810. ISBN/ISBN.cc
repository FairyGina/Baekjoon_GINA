#include<iostream>
using namespace std;
int main() {
	int digit[4] = {0};
	int result;
	for (int i = 0; i < 3;i++)
		cin >> digit[i];
	result = 91 + digit[0] + digit[2] + digit[1] * 3;
	cout << "The 1-3-sum is " << result;
	return 0;
}