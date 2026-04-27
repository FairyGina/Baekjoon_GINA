#include<iostream>
#include<cmath>
using namespace std;
int main() {
	int n[3];
	while (1){
		for (int i = 0; i < 3; i++)
			cin >> n[i];
		if ((n[0] == 0) && (n[1] == 0) && (n[2] == 0))
			break;
		if ((n[2] - n[1] == n[1] - n[0]) && (n[2] - n[1] != 0))
			cout << "AP " << n[2] * 2 - n[1];
		else
			cout << "GP " << n[2] * (n[2] / n[1]);
		cout << "\n";
	}
	return 0;
}