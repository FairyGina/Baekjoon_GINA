#include <stdio.h>

int main()
{
	int i, A, N, X;
	scanf("%d %d", &N, &X);

	for (i = 1; i <= N; i++)
	{
		scanf("%d", &A);

		if (A<X)
			printf("%d ", A);
	}
	

	return 0;
}