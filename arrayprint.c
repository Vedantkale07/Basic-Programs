#include<stdio.h>
int main()
{
    int a[50],n,i;
    printf("How many elements you wants:\n");
    scanf("%d",&n);
    printf("Enter the array elements:");
    for(i=0;i<n;i++)
    {
        scanf("%d\t",&a[i]);    
    }
    printf("!!! Array elements is...!!!\n");
    for(i=0;i<n;i++)
    {
        printf("%d\t",a[i]);
    }
}
