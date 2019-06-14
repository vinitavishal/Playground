#include<stdio.h>
int main()
{
  int first,third , num , add;
  scanf("%d", &num);
  first= num /100;
  third = num % 10;
  add = first+ third ;
  printf(" %d", add);
  //Type your code here
  return 0;
}