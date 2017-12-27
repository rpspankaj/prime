package prime.millerrabin;

public class Snippet {
	/*#include<stdio.h>
	
	void swap(char *x,char *y)
	{
		char t;
		t=*x;
		*x=*y;
		*y=t;
	}
	int StoI(char *st)
	{
		int i,sum=0;
		for(i=0;i<len;i++)
			sum=sum*10+st[i]-48;
	return sum;
	}
	int isPrime(int n)
	{
	int i;
	if(n<=1)return 0;
	if(n<=3)return 1;
	if(n%==0||n%3==0)return 0;
		for(i=5;i*i<=n;i+=6)
			if(n%i==0||n%(i+2)==0) return 0;
	return 1;
	}
	void permute(char *a,int l,int r)
	{
	int i,val;
	  if(l==r) {
		val=StoI(a);
		if(isPrime(val))
			if(max<val) max=val;
		}
		else{
			for(i=l;i<=r;i++){
				swap((a+l),(a+i));
				permute(a,l+1,r);
				swap((a+l),(a+i));
			}
		}
	}
	int main()
	{
	int max=0,len=4;
	char st[]="1234";
	permute(st,0,len-1);
	printf("%d",max);
	}*/
}

