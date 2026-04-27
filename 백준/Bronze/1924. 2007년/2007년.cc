#include<iostream>
using namespace std;
int main() {
	int month, day, sum, res;
	int start[14] = { 0,0,3,3,6,1,4,6,2,5,0,3,5 };
	string week[8] = { "SUN", "MON", "TUE","WED","THU","FRI", "SAT" };
	cin >> month >> day;
	res = (day + start[month]) % 7;
	cout << week[res];
	return 0;
}