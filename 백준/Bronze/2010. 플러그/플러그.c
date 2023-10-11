#include<stdio.h>
main() {
	int n;
	int sum = 0;
	scanf("%d", &n);
	for (int i = 0; i < n; i++) {
		int a;
		scanf("%d", &a);
		sum += a;
	}
	printf("%d", sum - n + 1);
}