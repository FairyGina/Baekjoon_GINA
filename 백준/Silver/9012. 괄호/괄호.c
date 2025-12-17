#include<stdio.h>
#include<string.h>
int main(){
	int t,q,i;
	scanf("%d",&t);
	while(t--){
		q=0;
		char s[51]="";
		scanf("%s",s);
		for(i=0;i<strlen(s);i++){
			s[i]=='('?q++:q--;
			if(q<0) break;
		}
			
		printf(q==0?"YES\n":"NO\n");
	}
	return 0;
}