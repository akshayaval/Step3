#include <stdio.h>
#include <stdbool.h>

bool containsDuplicate(int nums[], int n)
{
    for(int i = 0; i < n; i++)
    {
        for(int j = i + 1; j < n; j++)
        {
            if(nums[i] == nums[j])
                return true;
        }
    }
    return false;
}

int main()
{
    int n;

    printf("Enter size: ");
    scanf("%d", &n);

    int nums[n];

    printf("Enter elements:\n");
    for(int i = 0; i < n; i++)
        scanf("%d", &nums[i]);

    if(containsDuplicate(nums, n))
        printf("True");
    else
        printf("False");

    return 0;
}