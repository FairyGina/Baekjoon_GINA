#include <stdio.h>

int main()
{
	int res, i, R = 0;
	int num[10] = { 0 };
	int arr[42] = {0};
	
	for (i = 0; i < 10; i++) {
		scanf("%d", &num[i]);

	}
	for (i = 0; i < 10; i++) {
		res = num[i] % 42;
		arr[res]++;
	}
	for (i = 0; i < 42; i++) {
		if (arr[i] > 0)
			R++;
	}

	printf("%d", R);
	return 0;
}