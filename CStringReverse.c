#include<stdio.h>

void reverse(char *str)
{
   char *end = str;
   char tmp;
   if(str)
   {
      while(*end){
           ++end;
      }
      --end;
      while(str < end)
      {
          tmp = *str;
          *str++ = *end;
          *end-- = tmp;
       }
      while(*str){
           str--;
      }
      str++;
    }
    printf("The String in reverse order is: %s",str);
}
void main()
{
   char *str, cstr[5];
   str = cstr;
   printf("Enter the 5 letter string:");
   scanf("%s",str);
   printf("The string is: %s", str);
   reverse(str);
   getch();
}
