#include<stdio.h>

int main()
{
	int A, B;

	scanf("%d", &A);
	scanf("%d", &B);


	int OneB, TenB, HunB;
	OneB = B % 10;
	HunB = B / 100;
	TenB = (B - HunB * 100) / 10;
	 
	int Q, W, E, R;
	Q = A * OneB;
	W = A * TenB;
	E = A * HunB;
	R = Q + W * 10 + E * 100;

	printf("%d\n%d\n%d\n%d", Q, W, E, R);


	return 0;
}