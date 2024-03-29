#include<stdio.h>

void main(){

    double sum = 0, mult = 1,R;

    int n;

    printf("Enter how many resistor in parallel");
    scanf("%d",&n);
    
    int ar[n];
    for(int i = 0;i<n;i++){
        printf("Enter the value of resistor");
        scanf("%d",&ar[i]);
    }
    for(int i = 0;i<n;i++){
        sum = sum +ar[i];
        mult = mult * ar[i];
        R = (mult)/(sum);
    }

    printf("%f",R);

}