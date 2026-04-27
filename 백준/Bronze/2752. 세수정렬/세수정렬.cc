#include <stdio.h>

int main() {
	int a[4] = { 0 };
	int i, j, temp, least;
	for (i = 0; i < 3; i++)
		scanf("%d", &a[i]);
	for (i = 0; i < 3; i++) {
		least = i;
		for (j = i + 1; j < 4; j++)
			if (a[j] < a[least])
				least = j;
		temp = a[i];
		a[i] = a[least];
		a[least] = temp;
	}
	for (i = 1; i < 4; i++)
		printf("%d ", a[i]);


	return 0;
}