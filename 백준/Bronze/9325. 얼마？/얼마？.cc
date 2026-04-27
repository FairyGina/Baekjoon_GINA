#include<iostream>
using namespace std;
int main() {
	unsigned int repetition, s, n, p, q, res = 0;
	cin >> repetition;
	for (int i = 0; i < repetition; i++) {
		res = 0;
		cin >> s >> n;
		res += s;
		for (int j = 0; j < n; j++) {
			cin >> p >> q;
			res += p * q;
		}
		cout << res << "\n";
	}
	return 0;
}