#include<stdio.h>
struct stack { int s[100000], t, c; char a[200000]; };
void push(struct stack* st, int d) {
	st->t++, st->c++;
	st->a[st->c] = '+', st->s[st->t] = d;
}
void pop(struct stack* st) {
	st->t--, st->c++;
	st->a[st->c] = '-';
}
int main() {
	struct stack st;
	st.t = 0, st.c = 0;
	int i, n, d = 1, u[100000];
	scanf("%d", &n);
	for (i = 0; i < n; i++)
		scanf("%d", &u[i]);
	st.s[0] = 1, st.a[0] = '+', i = 0;
	while (1) {
		if ((st.t < -1) || (d > n + 1)) break;
		if (u[i] == st.s[st.t]) i++, pop(&st);
		else d++, push(&st, d);
	}
	if (i == n + 1)
		for (i = 0; i < st.c; i++)
			printf("%c\n", st.a[i]);
	else printf("NO");
	return 0;
}