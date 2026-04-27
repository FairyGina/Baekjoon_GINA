#include<stdio.h>
int main() {
	int text[5] = { 0 };
	int i, s, t, ave1 = 0, ave2 = 0;
	for (i = 0; i < 4; i++) {
		scanf("%d", &text[i]);
		ave1 += text[i];
	}
	for (i = 0; i < 4; i++) {
		scanf("%d", &text[i]);
		ave2 += text[i];
	}
	if (ave1 > ave2) {
		printf("%d", ave1);
	}
	else {
		printf("%d", ave2);
	}
	return 0;
}