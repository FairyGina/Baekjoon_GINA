#include<iostream>
using namespace std;
int main() {
	int n, i, j, h, l;
	cin >> n;
	for (j = 1; j <= n; j++)
	{
		for (i = n - 1; i >= j; i--)
			printf(" ");
		for (i = 1; i <= j; i++)
			printf("*");
		for (i = 1; i <= j - 1; i++)
			printf("*");

		printf("\n");
	}
	for (i = 1; i < n; i++) {
		for (j = 0; j < i; j++)
			cout << " ";
		for (j = n; j > i; j--)
			cout << "*";
		for (j = n-2; j > i - 1; j--)
			cout << "*";
		cout << "\n";
	}
	return 0;
}