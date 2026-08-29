#include <stdio.h>

int main() {
    int n, target;

    printf("Enter size: ");
    scanf("%d", &n);

    int a[n];

    printf("Enter elements:\n");
    for(int i=0; i<n; i++)
        scanf("%d", &a[i]);

    printf("Enter target: ");
    scanf("%d", &target);

    for(int i=0; i<n; i++) {
        for(int j=i+1; j<n; j++) {
            if(a[i] + a[j] == target) {
                printf("Indices = %d %d", i, j);
                return 0;
            }
        }
    }
}