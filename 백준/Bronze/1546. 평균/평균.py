N=int(input())
score=input().split()
M=0
sum=0
for i in score:
    i=int(i)
    if i>=M:
        M=i
    sum=sum+i
print(sum*100/M/N)
