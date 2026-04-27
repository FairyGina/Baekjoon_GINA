#include <stdio.h>
int main() {
	unsigned long long n, p, rest, res = 0;
	scanf("%llu", &n);
	for (int i = 0; i < n; i++) {
		scanf("%llu", &p);
    rest = 1;
		for (int j = 0; j < p % 10; j++)
			rest *= p / 10;
		res += rest;
	}
	printf("%llu", res);
	return 0;
	scanf("%llu", &p);
}