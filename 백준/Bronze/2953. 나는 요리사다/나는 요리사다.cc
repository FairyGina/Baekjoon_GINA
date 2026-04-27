#include<stdio.h>
int main() {
	int chef[5] = { 0 };
	int i, j, res, max = 0, num = 0;
	for (i = 0; i < 5; i++) {
		res = 0;
		for (j = 0; j < 4; j++) {
			scanf("%d", &chef[j]);
			res += chef[j];
		}
		if (max < res) {
			max = res;
			num = i+1;
		}
	}
	printf("%d %d", num, max);
	return 0;
}