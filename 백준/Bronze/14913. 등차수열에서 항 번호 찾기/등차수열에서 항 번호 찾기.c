#include<stdio.h>
int main() {
	int a, d, k;
	scanf("%d %d %d", &a, &d, &k);
	if ((d < 0) && (a >= k)) (k - a) % d == 0 ? printf("%d", (k - a) / d + 1) : printf("X");
	else if ((d > 0) && (a <= k)) (k - a) % d == 0 ? printf("%d", (k - a) / d + 1) : printf("X");
	else printf("X");
	return 0;
}