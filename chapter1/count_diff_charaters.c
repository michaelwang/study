#include <stdio.h>

/* count different charaters on input */

main()
{
  int i,c;
  int charaters[20000];
  for (i = 0; i < 25; ++i)
  {
    charaters[i] = 0;
  }
  while( (c= getchar()) != EOF)
  {
    ++ charaters[c - '0']  ;
    //    putchar(charaters[c]);
  } 
  
  for (i = 0; i < 100; ++i)
  {
    if( charaters[i] != 0)
    {
      printf ("%c , %d\n",(c = putchar(i + '0'))  ,charaters[i]);
    }
  }

}
