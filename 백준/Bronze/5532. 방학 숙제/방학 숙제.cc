#include <stdio.h>

int main() {
	int l, a, b, c, d, e, f;
	scanf("%d %d %d %d %d", &l, &a, &b, &c, &d);
	if ((a / c) >= (b / d)) {
		if ((a % c) == 0)
			e = a / c;
		if ((a % c) != 0)
			e = a / c+1;
	}
	if ((a / c) < (b / d)) {
		if ((b % d) == 0)
			e = b / d;
		if ((b % d) != 0)
			e = b / d+1;
	}
	f = l - e;
	printf("%d", f);

	return 0;
}