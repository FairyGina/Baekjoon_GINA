#include<stdio.h>
int main() {
	int d, h, m;
	scanf("%d %d %d", &d, &h, &m);
	m -= 11;
	if (m < 0) {
		m += 60;
		h--;
	}
	h -= 11;
	if (h < 0) {
		h += 24;
		d--;
	}
	d -= 11;
	m = 24 * 60 * d + 60 * h + m;
	if (d < 0)
		printf("-1");
	else{
		printf("%d", m);
	}
	return 0;
}