#include<stdio.h>
int main() {
	int a[4] = { 0 };
	int i, res = 0;
	for (i = 0; i < 3; i++)
		scanf("%d", &a[i]);
	if ((a[0] + a[1] + a[2]) == 180) {
		for (i = 0; i < 2; i++) {
			if (a[i] == a[i + 1])
				res++;
		}
		if (a[0] == a[2])
			res++;
		if (res == 3)
			printf("Equilateral");
		if (res == 1)
			printf("Isosceles");
		if (res == 0)
			printf("Scalene");
	}
	else
		printf("Error");

	return 0;
}