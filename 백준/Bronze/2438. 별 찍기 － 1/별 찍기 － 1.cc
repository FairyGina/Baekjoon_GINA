#include <stdio.h>

int main()
{
	int i, j, N;
	scanf("%d", &N);
	
	for (j = 1; j <= N; j++)
	{
		for (i = 1; i <= j; i++)
			printf("*");

		printf("\n");
	}
	return 0;
}