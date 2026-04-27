#include<stdio.h>
#include<string.h>
int main(){
	int t,q=0;
	scanf("%d",&t);
	for(int i=0;i<t;i++){
		char s[1001];
		scanf("%s",s);
		if(strlen(s)==3){
			if((s[0]=='a')&&(s[1]=='n')&&(s[2]=='j')){
				q=1;
				break;
			}
		}
	}
	char c=(q!=1)?'?':';';
	printf("뭐야%c",c);
	return 0;
}