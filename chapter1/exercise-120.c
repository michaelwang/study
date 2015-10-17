#include <stdio.h>
#define MAXLINE 1000   /* maximum input line size */

/* print the longest input line */
int main(){
  int c,i = 0;
  char line[MAXLINE];
  while( (c = getchar()) != EOF)
    if ( c != '\t' && c != ' ' && c != '\n')
      line[i++] = c;
    else if ( c == '\n')
      printf("input line %s",line);
  return 0;
}
