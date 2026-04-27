#include<stdio.h>
int main() {
	int a, b, c, d, e;
	scanf("%d", &a);
	if (a < 40)
		a = 40;
	scanf("%d", &b);
	if (b < 40)
		b = 40;
	scanf("%d", &c);
	if (c < 40)
		c = 40;
	scanf("%d", &d);
	if (d < 40)
		d = 40;
	scanf("%d", &e);
	if (e < 40)
		e = 40;
	printf("%d", (a+b+c+d+e)/5);
	return 0;
}