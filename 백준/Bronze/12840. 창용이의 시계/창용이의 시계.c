#include<stdio.h>
int main(){
	int h,m,s,t,c,q,r=0;
	scanf("%d %d %d %d",&h,&m,&s,&t);
	r=s+m*60+h*3600;
	while(t--){
		scanf("%d",&q);
		if(q==1){
			scanf("%d",&c);
			r+=c;
			r=r%86400;
		}
		else if(q==2){
			scanf("%d",&c);
			r-=c;
			r=r%86400;
			if(r<0) r+=86400;
			
		}
		else{
			h=r/3600;
			m=r/60%60;
			printf("%d %d %d\n",h,m,r%60);
		}
	}
	return 0;
}