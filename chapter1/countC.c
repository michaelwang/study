#include <stdio.h>

/* count characters in input ; 1st version */

int main()
{
  long nc;
  nc = 0;
  int c, bl, t, nl; /* char, blank, tab ,new line */
  int character;
  while( (character = getchar()) != EOF )
  {
    if(character == ' ')
      bl++;
    else if (character == '\n')
      nl++;
    else if (character == '\t')
      t++;
    else {
      ++nc;
    }
  }

  printf ("spc\tline\ttabs\tchars\tblank\n");
  printf ("\t%d\t%d\t%ld\t%d\n",nl,t,nc,bl);

}
