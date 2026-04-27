#include<stdio.h>

int main()
{
	int A, B, C, D, HM, H, M;

	scanf("%d %d %d %d", &A, &B, &C, &D);

	HM = A + B + C + D;
	H = HM / 60;
	M = HM - H*60;

	printf("%d\n%d", H, M);

	return 0;
}