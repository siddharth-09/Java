#include <stdio.h>

void main()
{

    int n = 7, start;
    char Start;

    for (int i = 1; i <= n; i++)
    {
        Start = 'A';
        for (int j = 1; j <= i; j++)
        {
            if (i % 2 == 0)
            {
                printf("%c", Start);
                Start++;
            }
            else
            {
                printf("%d", j);
            }
        }
        printf("\n");
    }
}