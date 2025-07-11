#include <stdio.h>

int main() {
	int h, m, hour, minute, A, M;

	scanf("%d %d %d", &h, &m, &M);

	A = h * 60 + m+M;
	hour = A / 60;
	minute = A - hour*60;
	if (hour > 23) {
		hour -= 24;
		printf("%d %d", hour, minute);
	}
	else
		printf("%d %d", hour, minute);

	return 0;
}