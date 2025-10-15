#include <stdio.h>

int main()
{
	unsigned int A, B, C, D;
	D = 0;

	scanf("%d %d %d", &A, &B, &C);
	

	if (B < C)
	{
		D = A/(C-B)+1;
		printf("%d", D);
	}
	if (B >= C)
		printf("-1");
	
	return 0;
}