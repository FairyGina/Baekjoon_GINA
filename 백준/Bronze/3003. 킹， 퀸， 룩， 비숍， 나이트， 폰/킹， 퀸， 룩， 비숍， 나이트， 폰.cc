#include<stdio.h>

int main()
{
	int A[6] = {1,1,2,2,2,8};
	int B[6] = {0};
	int i;

	for (i = 0; i < 6; i++)
		scanf("%d", &B[i]);

	for (i = 0; i < 6; i++)
		printf("%d ", A[i]-B[i]);
    
	return 0;
}