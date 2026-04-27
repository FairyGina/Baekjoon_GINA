#include <stdio.h>

int main() {
	int n, m, c;
	int a = 0, b = 0;
	scanf("%d %d", &n, &m);
	a = (n+m)/2;
	b = n - a;
	c = a - b;
	if (c < 0)
		c = -c;
	if ((n < m) || (c != m))
		printf("-1");
	else {
		if (a >= b)
			printf("%d %d", a, b);
		if (a < b)
			printf("%d %d", b, a);
	}
	return 0;
}