#include<stdio.h>

int main()
{
	int i, B = 0;
	int A[5] = { 0 };

	for (i = 0; i < 5; i++) {
		scanf("%d", &A[i]);
		B += A[i];
	}

	printf("%d", B);
	return 0;
}