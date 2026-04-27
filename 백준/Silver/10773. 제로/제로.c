#include<stdio.h>
struct stack { int s[100000], t; };
void push(struct stack* st, long long n) {
	st->t++;
	st->s[st->t] = n;
}
int pop(struct stack* st) {
	int d = st->t;
	st->t--;
	return st->s[d];
}
int main() {
	struct stack st;
	st.t = -1;
	long long k, n, res = 0;
	scanf("%lld", &k);
	for (int i = 0; i < k; i++) {
		scanf("%lld", &n);
		res += n;
		if (n != 0) push(&st,n);
		else res-=pop(&st);
	}
	printf("%lld", res);
	return 0;
}