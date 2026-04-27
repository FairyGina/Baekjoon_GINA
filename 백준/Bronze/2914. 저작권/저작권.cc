#include<stdio.h>

int main()
{
	int A, ave, M;

	scanf("%d %d", &A,&ave);
	M = A * (ave-1)+1;
	printf("%d", M);

	return 0;
}