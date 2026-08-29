#include <stdio.h>

int maxProfit(int prices[], int n)
{
    int min = prices[0];
    int profit = 0;

    for(int i = 1; i < n; i++)
    {
        if(prices[i] < min)
            min = prices[i];

        if(prices[i] - min > profit)
            profit = prices[i] - min;
    }

    return profit;
}

int main()
{
    int n;

    printf("Enter number of days: ");
    scanf("%d", &n);

    int prices[n];

    printf("Enter prices:\n");
    for(int i = 0; i < n; i++)
        scanf("%d", &prices[i]);

    printf("Maximum Profit = %d", maxProfit(prices, n));

    return 0;
}