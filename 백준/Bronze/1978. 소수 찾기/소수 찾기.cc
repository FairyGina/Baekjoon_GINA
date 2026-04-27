#include <stdio.h>

int main()
{
	unsigned int N, A, B, L = 0, k = 0;

	scanf("%d", &N);

	for (int i = 1; i <= N; i++) {
		int L = 0;
		scanf("%d", &A);
		for (int j = 1; j <= A; j++) {
			B = A % j;
			if (B == 0)
				L++;
			
		}
		if (L == 2)
			k++;
	}

	printf("%d", k);
	return 0;
}