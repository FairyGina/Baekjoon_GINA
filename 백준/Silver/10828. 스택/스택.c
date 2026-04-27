#include<stdio.h>
#include<string.h>
#include<stdlib.h>
struct stack { int st[10001]; int t;};
void push(struct stack* st, char* s) {
	st->t++;
	char n[7] = "";
	for (int i = 5, j = 0; i < strlen(s); i++, j++) {
		n[j] = s[i];
	}
	st->st[st->t]= atoi(n);
}
int pop(struct stack *st) {
	int d = st->t;
	st->t--;
	return st->st[d];
}
int main() {
	struct stack st;
	st.t = -1;
	int n;
	scanf("%d", &n);
	getchar();
	for (int i = 0; i < n; i++) {
		char s[12] = "";
		gets(s);
		if (s[0] == 'p') {
			if (s[1] == 'u') push(&st,s);
			else {
				if (st.t == -1) printf("-1\n");
				else printf("%d\n", pop(&st));
			}
		}
		else if (s[0] == 's') printf("%d\n", st.t + 1);
		else if (s[0] == 'e') {
			if (st.t == -1) printf("1\n");
			else printf("0\n");
		}
		else {
			if (st.t == -1) printf("-1\n");
			else printf("%d\n", st.st[st.t]);
		}
	}
	return 0;
}