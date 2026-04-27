#include<stdio.h>
int main() {
	unsigned int n;
	double a;
	scanf("%d", &n);
	for (int i = 0; i < n; i++) {
		scanf("%lf", &a);
		printf("$%.2f\n", (a* 4) / 5);
	}

	return 0;
}