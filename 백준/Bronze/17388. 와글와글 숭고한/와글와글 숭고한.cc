#include<iostream>
using namespace std;
int main() {
	int s[4] = { 0 };
	int res = 0, min = 100;
	for (int i = 0; i < 3; i++)
		cin >> s[i];
	if ((s[0]+s[1] +s[2]) >= 100)
		cout << "OK";
	else {
		for (int i = 0; i < 3; i++) {
			if (s[i] < min)
				min = s[i];
		}
		if (min == s[0])
			cout << "Soongsil";
		if (min == s[1])
			cout << "Korea";
		if (min == s[2])
			cout << "Hanyang";
	}


	return 0;
}