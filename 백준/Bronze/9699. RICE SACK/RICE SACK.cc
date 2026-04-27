#include <iostream>
using namespace std;
int main() {
	int t, m;
	cin >> t;
	for (int i = 1; i <= t; i++) {
		int max = 0;
		for (int j = 0; j < 5; j++) {
			cin >> m;
			if (max < m)
				max = m;
		}
		cout << "Case #" << i << ": " << max << "\n";
	}
	return 0;
}