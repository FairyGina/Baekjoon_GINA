#include <stdio.h>
#include<string.h>
int main() {
	int t, o;
	scanf("%d", &t);
	for (int i = 0; i < t; i++) {
		char ch[81] = "";
		scanf("%d", &o);
		scanf("%s", ch, sizeof(ch));
		for (int j = 0; j < o - 1; j++)
			printf("%c", ch[j]);
		for (int j = o; j < strlen(ch); j++)
			printf("%c", ch[j]);
		printf("\n");
	}
	return 0;
}