#include <stdio.h>

int main() {

    int n,k;

    printf("Enter size: ");
    scanf("%d",&n);

    int a[n], b[n];

    printf("Enter elements:\n");
    for(int i=0;i<n;i++)
        scanf("%d",&a[i]);

    printf("Enter k: ");
    scanf("%d",&k);

    k=k%n;

    for(int i=0;i<n;i++)
        b[(i+k)%n]=a[i];

    printf("Rotated Array:\n");

    for(int i=0;i<n;i++)
        printf("%d ",b[i]);

    return 0;
}