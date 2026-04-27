#include<iostream>
using namespace std;
int main() {
	string repeat;
	char a[27] = "abcdefghijklmnopqrstuvwxyz";
	int save, t = 0;
	int answer = 0, res = 1;
	cin >> repeat;
	for (auto c : repeat) {
		for (int i = 0; i < 27; i++) {
			if (c == a[i]) {
				if (t == 0) {
					save = i;
					t++;
				}
				else {
					answer = i;
					if (save >= answer)
						res++;
					save = answer;
				}
			}
		}
	}
	cout << res;
	return 0;
}