#include <stdio.h>

int main()
{
	int N, A;
	int min = 1000000, max = -1000000;

	scanf("%d", &N);

	for (int j = 0; j < N; j++)
	{
		scanf("%d", &A);

		if (A < min)
			min = A;
		if (A > max)
			max = A;
	}

	printf("%d %d", min, max);
	
	return 0;
}