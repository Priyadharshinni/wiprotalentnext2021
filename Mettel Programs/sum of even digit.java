//Even digit

boolean b=true;
int r,sum=0;

while(input1>0)
{
r=input1%10;
if(r%2==0)
{
sum=sum+r;
}
input1=input1/10;
}
return sum;
