#include <stdio.h>
int main() {
	float s, m, max = 0, mn;
	char g;
	for (int i = 0; i<3; i++) {
		scanf("%f %f", &s, &m);
		if (s<500) m /= s;
		else m /= (s - 50);
		if (m>max) max = m, mn = i;
	}
	if (mn == 0) printf("S");
	else if (mn == 1) printf("N");
	else printf("U");
	return 0;
}