#include<stdio.h>

int main()
{
	int Y, M;

	scanf("%d %d", &Y, &M);
	printf("%d", M + (M - Y));

	return 0;
}