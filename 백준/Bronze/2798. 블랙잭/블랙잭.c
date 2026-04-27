#include<stdio.h>
int main(){
	int n,m,i,j,k,r,a=0,s[100];
	scanf("%d %d",&n,&m);
	for(i=0;i<n;i++) scanf("%d",&s[i]);
	for(i=0;i<n-2;i++){
		for(j=i+1;j<n-1;j++){
			for(k=j+1;k<n;k++){
				r=s[i]+s[j]+s[k];
				if((r<=m)&&(a<r)) a=r;
			}
		}
	}
	printf("%d",a);
	return 0;
}