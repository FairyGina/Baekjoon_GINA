#include<stdio.h>
#include<string.h>
int ch(int n, int c) {
	if (c < n) return c;
	else return n;
}
int main() {
	int n, f, s, g, res = 0;
	scanf("%d %d %d %d", &n, &f, &s, &g);
	res = ch(n, f) + ch(n, s) + ch(n, g);
	printf("%d", res);
	return 0;
}