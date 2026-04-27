#include<iostream>
using namespace std;
int main() {
	int a1, a2, b1, b2, resa = 0, resb = 0;
	cin >> a1 >> b1 >> a2 >> b2;
	resa = resa + a1 + b2;
	resb = resb + a2 + b1;
	if (resa > resb)
		cout << "Persepolis";
	else if (resa < resb)
		cout << "Esteghlal";
	else {
		if (b1 > b2)
			cout << "Esteghlal";
		else if (b1 < b2)
			cout << "Persepolis";
		else
			cout << "Penalty";
	}
	return 0;
}