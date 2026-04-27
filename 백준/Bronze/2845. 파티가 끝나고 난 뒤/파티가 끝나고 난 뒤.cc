#include<stdio.h>

int main()
{
	int L, B, LB;
	scanf("%d %d", &L, &B);
	int NEWS[5] = { 0 };
	LB = L * B;

	for (int i = 0; i < 5; i++) {
		scanf("%d", &NEWS[i]);
		NEWS[i] -= LB;
	}


	for (int i = 0; i < 5; i++)
		printf("%d ", NEWS[i]);

	
	return 0;
}