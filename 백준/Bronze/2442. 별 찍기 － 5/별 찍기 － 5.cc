#include <stdio.h>

int main()
{
	int i, j, N;
	scanf("%d", &N);

	for (j = 1; j <= N; j++)
	{
		for (i = N - 1; i >= j; i--)
			printf(" ");
		for (i = 1; i <= j; i++)
			printf("*");
		for (i = 1; i <= j-1; i++)
			printf("*");

		printf("\n");
	}
	return 0;
}