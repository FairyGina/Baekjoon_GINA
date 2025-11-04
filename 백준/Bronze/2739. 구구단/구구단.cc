#include <stdio.h>

int main()
{
	int N,i,RH;
	scanf("%d", &N);

	for (i = 1; i <= 9; i = i + 1)
	{
		RH = N * i;
		printf("%d * %d = %d\n", N, i, RH);
	}

	return 0;
}