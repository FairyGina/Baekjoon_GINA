#include<stdio.h>
int main(){
	int t,i,j,q,s[1000];
	scanf("%d",&t);
	for(i=0;i<t;i++) scanf("%d",&s[i]);
	for(i=0;i<t-1;i++){
		for(j=i+1;j<t;j++){
			if(s[i]>s[j]){
				q=s[j];
				s[j]=s[i];
				s[i]=q;
			}
		}
	}
	q=0;
	for(i=0;i<t;i++) for(j=0;j<=i;j++) q+=s[j];
	printf("%d",q);
	return 0;
}