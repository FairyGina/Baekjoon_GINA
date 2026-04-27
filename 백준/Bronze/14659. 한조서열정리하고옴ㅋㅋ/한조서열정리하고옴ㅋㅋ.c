#include <stdio.h>
int main() {
	int n, a, b, max = 0, ans = 0;
	scanf("%d", &n);
	scanf("%d", &b);
	for (int i = 1; i<n; i++) {
		scanf("%d", &a);
		if (a <= b) {
			max++;
			if (ans < max)
				ans = max;
		}
		else
			max = 0, b = a;
	}
	printf("%d", ans);
	return 0;
}