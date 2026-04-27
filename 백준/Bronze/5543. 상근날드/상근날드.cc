#include <stdio.h>

int main() {
	int a[4] = { 0 };
	int b[3] = { 0 };
	int i, burger = 2000, beverage=2000;
	for (i = 0; i < 3; i++) {
		scanf("%d", &a[i]);
		if (burger > a[i])
			burger = a[i];
	}
	for (i = 0; i < 2; i++) {
		scanf("%d", &b[i]);
		if (beverage > b[i])
			beverage = b[i];
	}

	printf("%d", burger+beverage-50);
	return 0;
}