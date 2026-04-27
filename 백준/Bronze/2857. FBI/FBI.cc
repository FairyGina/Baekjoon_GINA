#include <iostream>
#include<string>
using namespace std;
int main() {
	cin.sync_with_stdio(false);
	cin.tie(nullptr);
	string name;
	int num[5] = { 0 };
	bool x = 0;
	for (int i = 1; i < 6; i++) {
		cin >> name;
		for (int j = 0; j < name.length() - 2; j++) {
			if (name[j] == 'F')
				if (name[j + 1] == 'B')
					if (name[j + 2] == 'I') {
						x = 1, num[i - 1] = i;
						break;
					}
		}
	}
	for (int i = 0; i < 5; i++) {
		if (num[i] != 0)
			cout << num[i] << " ";
	}
	if (x == 0)
		cout << "HE GOT AWAY!";
	return 0;
}