#include <stdio.h>
#define INITIAL_SIZE 10   /* maximum input line size */

int getline(char line[ ]);
void copy(char to[ ], char from[ ]);

/* print the longest input line */
main(){
  int len;   /* current line length */
  int max;   /* maxmum length seen so far */
  char line[INITIAL_SIZE];   /* current input line */
  char longest[INITIAL_SIZE];   /* longest lines saved here */

  max = 0 ; 
  while ((len = getline(line)) > 0)
    if(len > max){
        max = len ;
        copy(longest,line);
    }
  if(max > 0) /* there was a line */
     printf ("%s\n",longest);
  return 0;
}

/* getline: read a line into s, return length */
int getline(char s[ ]){
  int c , i;
  int size, step = 20;
  size = INITIAL_SIZE;
  for(i=0; (c = getchar()) != EOF && c != '\n' ; ++i){
    s[i] = c ;
    if ( i+1 == size ){
      size = size + step ;
      char newChars[size];  
      int cnt;
      while( cnt++ < i){
	newChars[cnt] = s[cnt];	  
      }
      s = newChars;
    }
  }
  if ( c == '\n'){
    s[i] = c ;
    ++i;
  }
  s[i] = '\0';
  return i;
}

/* copy: copy 'from' into 'to'; assume to is big enough */
void copy(char to[ ], char from[ ]){
  int i;

  i = 0;
  while( (to[i] = from[i]) != '\0')
    ++i;
} 

