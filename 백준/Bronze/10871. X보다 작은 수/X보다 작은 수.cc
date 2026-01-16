#include<stdio.h>
main()
{
	int n,x,i,j; 
	scanf("%d %d",&n,&x);
	int a[n];
	for(i=1; i<=n; i++)
	scanf("%d",&a[i-1]);
	for(j=0; j<=n-1; j++)
	{
		if(a[j]<x)
		printf("%d ",a[j]);
	}
}