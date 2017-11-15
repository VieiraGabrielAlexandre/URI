#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
int main (){
    double a = 0, b = 0, TOTAL = 0, SOMA;
    char x[100];
    
    gets(x);
    scanf ("%lf", &a);
    scanf ("%lf", &b);
    SOMA = b * 0.15 ;
    TOTAL = a + b;
    printf ("%s\n", x);
    printf ("TOTAL = R$ %.2lf\n", TOTAL);
    system ("pause");
    return 0;
}
