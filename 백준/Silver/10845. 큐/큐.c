#include<stdio.h>
#include<string.h>
#include<stdlib.h>
struct queue { int q[10001]; int f, b; };
void push(struct queue* qu, char* s) {
	qu->b++;
	char n[7] = "";
	for (int i = 5, j = 0; i < strlen(s); i++, j++) {
		n[j] = s[i];
	}
	qu->q[qu->b] = atoi(n);
}
int pop(struct queue *qu) {
	qu->f++;
	return qu->q[qu->f];
}
int main() {
	struct queue qu;
	qu.f = -1, qu.b = -1;
	int n;
	scanf("%d", &n);
	getchar();
	for (int i = 0; i < n; i++) {
		char s[12] = "";
		gets(s);
		if (s[0] == 'p') {
			if (s[1] == 'u') push(&qu,s);
			else {
				if (qu.b == qu.f) printf("-1\n");
				else printf("%d\n", pop(&qu));
			}
		}
		else if (s[0] == 's') printf("%d\n", qu.b - qu.f);
		else if (s[0] == 'e') {
			if (qu.b == qu.f) printf("1\n");
			else printf("0\n");
		}
		else if (s[0] == 'f') {
			if (qu.b == qu.f) printf("-1\n");
			else printf("%d\n", qu.q[qu.f + 1]);
		}
		else {
			if (qu.b == qu.f) printf("-1\n");
			else printf("%d\n", qu.q[qu.b]);
		}
	}
	return 0;
}