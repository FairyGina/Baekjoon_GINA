#include<stdio.h>
#include<string.h>
int main() {
	int f;;
	char s[1001];
	scanf("%s %d", s, &f);
	printf("%c", s[f - 1]);
	return 0;
}