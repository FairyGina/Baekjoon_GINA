#include<stdio.h>

int main()
{
	unsigned int N, A, B;
	int arr[5] = { 0 };
	for (int i = 0; i < 5; i++) {
		scanf("%d", &N);
		A = N * N;
		arr[i] = A;
	}
	B = (arr[0]+arr[1] + arr[2] + arr[3] + arr[4])%10;
	printf("%d", B);


	return 0;
}