#include<stdio.h>
int main() {
	int t;
	scanf("%d", &t);
	while (t--) {
		unsigned long long n;
		scanf("%llu", &n);
		printf("%llu\n", n * n);
	}
	return 0;
}