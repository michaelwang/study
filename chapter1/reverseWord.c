#include <stdio.h>
#include <stdlib.h>

main(){

  int i, c;
  char str[50];
  for(i = 0; (c = getchar()) != EOF && c != '\n' ; i++) {
    if(c != ' '){
       str[i] = c;
    }
  }
  
  for(;i >= 0; i--){
     printf ("%c",str[i-1]);
  }
  printf ("\n");
}
