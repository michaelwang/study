#include <stdio.h>
#include<stdlib.h>

#define INITIAL_SIZE 10   /* maximum input line size */

int getline();
void copy(char to[ ], char from[ ]);

/* print the longest input line */
main(){
  int len;   /* current line length */
  int max;   /* maxmum length seen so far */
  char line[INITIAL_SIZE];   /* current input line */
  char longest[INITIAL_SIZE];   /* longest lines saved here */

  max = 0 ; 
  while ((len = getline()) > 0)
    if(len > max){
        max = len ;
	//    copy(longest,line);
    }
  //  if(max > 0) /* there was a line */
	// printf ("%s\n",longest);
  return 0;
}

/* getline: read a line into s, return length 
   set one char array used to store the user input
   if the user input exceed the max length of the char array
   copy the chars into larger array, then use the larger array
   store the user input 
*/
int getline(){
  int c , i;
  size_t size = 10;
  int step = 5;
  char *str;
  str = realloc(NULL,sizeof(char)*size); // size is start size
  for(i=0; (c = getchar()) != EOF && c != '\n' ; ++i){
    str[i] = c ;
    if ( i+1 == size ){
      str = realloc(str,sizeof(char)*(size+=step)) ;
    }
  }
  if ( c == '\n'){
    str[i] = c ;
    ++i;
  }
  str[i] = '\0';
  printf ("in final str is : %s\n",str);
  return i;
}

/* copy: copy 'from' into 'to'; assume to is big enough */
void copy(char to[ ], char from[ ]){
  int i;

  i = 0;
  while( (to[i] = from[i]) != '\0')
    ++i;
} 

