#include<stdio.h>
int main() {
	int a[7] = { 0 };
	int i, j, h, m, s;
	for (j = 0; j < 3; j++) {
		for (i = 0; i < 6; i++) {
			scanf("%d", &a[i]);
		}
		a[5] -= a[2];
		if (a[5] < 0) {
			a[5] += 60;
			a[4] -= 1;
		}
		a[4] -= a[1];
		if (a[4] < 0) {
			a[4] += 60;
			a[3] -= 1;
		}

		a[3] -= a[0];
		if (a[4] < 0) {
			a[4] += 60;
			a[3] -= 1;
		}

		for (i = 3; i < 6; i++)
			printf("%d ", a[i]);

	}

	return 0;
}