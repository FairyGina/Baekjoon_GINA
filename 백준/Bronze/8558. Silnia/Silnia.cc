#include<stdio.h>
int main() {
	unsigned long long res = 1, n;
	scanf("%llu", &n);
	for (int i = 1; i <= n; i++) {
		res *= i;
		res %= 10;
	}
	printf("%llu", res);
	scanf("%llu", &n);
	return 0;
}