#include <stdio.h>
int main() {
    long long t,a,b,ans;
    char c;
    scanf("%lld",&t);
    for(int i=0;i<t;i++){
      scanf("%lld %c %lld = %lld",&a,&c,&b,&ans);
      if(c=='+'){
        if(a+b==ans) printf("correct\n");
        else printf("wrong answer\n");
      }
      if(c=='-'){
        if(a-b==ans) printf("correct\n");
        else printf("wrong answer\n");
      } 
      if(c=='*'){
        if(a*b==ans) printf("correct\n");
        else printf("wrong answer\n");
      } 
      if(c=='/'){
        if(a/b==ans) printf("correct\n");
        else printf("wrong answer\n");
      } 
    }
    return 0;
}