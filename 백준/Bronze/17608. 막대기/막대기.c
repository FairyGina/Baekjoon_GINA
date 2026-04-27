#include<stdio.h>
struct stack { int s[100000], t; };
int main() {
    struct stack st;
    st.t = -1;
    int n, max = 0, res = 0;
    scanf("%d", &n);
    for (int i = 0; i < n; i++) {
        st.t++;
        scanf("%d", &st.s[st.t]);
        while (1) {
            if ((st.t == 0) || (st.s[st.t] < st.s[st.t - 1])) break;
            else {
                int d = st.s[st.t];
                st.t--;
                st.s[st.t] = d;
            }
        }
    }
    printf("%d", st.t + 1);
    return 0;
}