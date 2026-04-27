#include <stdio.h>

int main()
{
	int A, B, C, D = 0, res = 0;

	scanf("%d %d %d", &A, &B, &C);
	int arr[10] = { 0 };

	D = A * B * C;

	for (int i = D; i > 0; i /= 10) {
		res = i % 10;
		arr[res]++;
	}

	for (int i = 0; i <= 9; i++)
		printf("%d\n", arr[i]);



	return 0;
}