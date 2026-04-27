#include<iostream>
using namespace std;
int main() {
	char wl;
	int res=0;
	for (int i = 0; i < 6; i++) {
		cin >> wl;
		if (wl == 'W')
			res++;
	}
	if (res > 4)
		cout << "1";
	if ((res < 5) && (res > 2))
		cout << "2";
	if ((res < 3) && (res > 0))
		cout << "3";
	if (res == 0)
		cout << "-1";

	return 0;
}