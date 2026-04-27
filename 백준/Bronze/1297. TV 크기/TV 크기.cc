#include <stdio.h>
#include <math.h>

int main() {
	int d, h, w;
	scanf("%d %d %d", &d, &h, &w);
	double x = sqrt(1.0 * d * d / (h * h + w * w));
	int H = h * x;
	int W = w * x;
	int h1 = H;
	int w1 = W;
	printf("%d %d",h1, w1);

	return 0;
}