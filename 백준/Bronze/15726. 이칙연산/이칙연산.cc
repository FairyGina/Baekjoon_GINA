#include<iostream>
using namespace std;
int main() {
	double math[4] = { 0 };
	for (int i = 0; i < 3; i++)
		cin >> math[i];
	if ((math[0] / math[1] * math[2]) > (math[0] * math[1] / math[2]))
		cout << int(math[0] / math[1] * math[2]);
	else
		cout << int(math[0] * math[1] / math[2]);
	
	return 0;
}