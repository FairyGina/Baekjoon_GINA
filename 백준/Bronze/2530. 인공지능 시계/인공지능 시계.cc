#include <stdio.h>

int main() {
	int h, m, s, s1, time;
	scanf("%d %d %d %d", &h, &m, &s, &s1);
	if (s1>=3600){
		time = s1/3600;
		h = h + time;
		s1 = s1 - time * 3600;
	}
	if (s1 >= 60) {
		time = s1 / 60;
		m = m + time;
		s1 = s1 - time * 60;
	}

	s += s1;

	if (s > 59) {
		time = s / 60;
		m += time;
		s = s - time * 60;
	}

	if (m > 59) {
		time = m / 60;
		h += time;
		m = m- time * 60;
	}
	if (h > 23) {
		time = h / 24;
		h = h - time * 24;
	}

	printf("%d %d %d", h, m, s);

	return 0;
}