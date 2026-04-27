#include <stdio.h>

int main()
{
	int N, x = 1, t = 0;

	for (int i = 1; i <= 9; i++) {
		scanf("%d", &N);
		if (N > x)x = N, t = i;
	}

	printf("%d\n%d", x, t);
	return 0;
}