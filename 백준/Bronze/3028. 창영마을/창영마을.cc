#include<iostream>
#include<string>
using namespace std;
int main() {
	int answer = 1;
	string cup;
	cin >> cup;
	for (auto c : cup) {
		if (c == 'A') {
			if (answer != 3)
				answer ^= 3;
		}
		if (c == 'B') {
			if (answer != 1)
				answer ^= 1;
		}
		if (c == 'C') {
			if (answer != 2)
				answer ^= 2;
		}
	}
	cout << answer;
	return 0;
}