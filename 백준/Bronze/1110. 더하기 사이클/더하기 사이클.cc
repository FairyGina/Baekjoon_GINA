#include <stdio.h>

int main()
{
	int N, A, i, Ten, One, One1;
	i = 1;
	scanf("%d", &N);

	if (N < 10)
		Ten = 0;
	else
		Ten = N / 10;

	One = N % 10;

	One1 = (Ten + One) % 10;
	A = One * 10 + One1;
	if (N == A)
		printf("%d", i);
	if (N != A)
	{
		while (1)
		{
			i += 1;

			if (A < 10)
				Ten = 0;
			else
				Ten = A / 10;

			One = A % 10;
			One1 = (Ten + One) % 10;
			A = One * 10 + One1;
			if (N == A)
			{
				printf("%d", i);
				break;
			}
			else
				continue;
		}
	}
	return 0;
}