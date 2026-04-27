#include<stdio.h>
#include<string.h>
int main(){
	int i=0;
	char s[10001];
	scanf("%[^\n]s",s);
	for(;i<strlen(s)-1;i++)
		if((s[i]=='d')||(s[i]=='D')){
			if(s[i+1]=='2'){
				printf("D2");
				break;
			}
		}
	if(i==strlen(s)-1) printf("unrated");
	return 0;
}