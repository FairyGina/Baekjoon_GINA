#include<iostream>
using namespace std;
int main(){
	int g, s, c, num = 0;
	cin >> g >> s >> c;
	num = g * 3 + s * 2 + c * 1;
	if (num > 7)
		cout << "Province or ";
	else if (num > 4)
		cout << "Duchy or ";
	else if (num > 1)
		cout << "Estate or ";
	if (num > 5)
		cout << "Gold";
	else if (num > 2)
		cout << "Silver";
	else if (num < 3)
		cout << "Copper";
	return 0;
}