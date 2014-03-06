#include <stdio.h>

char buf[100] ;
int bufP;

int pop()
{
  if (bufP > 0)
  {
    return buf[--bufP];      
  }else
    return -1;
}

void push(char s)
{
  buf[bufP++] = s;
}

int main(int argc, char *argv[])
{
  char c ;
  while( (c = getchar()) != EOF && c != '\n'){
    push(c);
  }

  while(bufP > 0){
    printf ("%c\n",pop());
  } 
  return 0;
}

