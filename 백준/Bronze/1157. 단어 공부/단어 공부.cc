#include<iostream>
using namespace std;
int main() {
	string txt = "";
	char alpha[27] = "";
	int result[27] = { 0 };
	int max = 0, same = 0, al;
	for (int i = 0; i < 26; i++)
		alpha[i] = 'A' + i;
	cin >> txt;
	for (int i = 0; i < txt.size(); i++) {
		txt[i] &= '_';
		for (int j = 0; j < 26; j++) {
			if (txt[i] == alpha[j])
				result[j]++;
		}
	}
	for (int i = 0; i < 26; i++) {
		if (result[i] > max) {
			max = result[i];
			al = i;
		}
	}
	for (int i = 0; i < 26; i++)
		if (max == result[i])
			same++;
	if (same > 1)
		cout << "?";
	else
		cout << alpha[al];
	return 0;
}