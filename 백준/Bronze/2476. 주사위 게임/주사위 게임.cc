#include <stdio.h>

int main()
{
    int player, i, j, prize, M = 0;
    int dice[3] = { 0 };
    int play[1000] = { 0 };
    prize = 0;
    scanf("%d", &player);

    for (i = 0; i < player; i++)
    {
        M = 0;
        for (j = 0; j < 3; j++)
        {
            scanf("%d", &dice[j]);
        }
        if ((dice[0] == dice[1]) && (dice[1] == dice[2]) && (dice[2] == dice[0]))
            prize = 10000 + dice[0] * 1000;
        else if ((dice[0] != dice[1]) && (dice[1] != dice[2]) && (dice[2] != dice[0]))
        {
            for (j = 0; j < 3; j++)
            {
                if (M < dice[j])
                    M = dice[j];
            }
            prize = M * 100;
        }
        else
        {
            if ((dice[0] == dice[1]) && (dice[0] != dice[2]))
                prize = 1000 + dice[0] * 100;
            if (dice[1] == dice[2] && (dice[1] != dice[0]))
                prize = 1000 + dice[1] * 100;
            if (dice[2] == dice[0] && (dice[0] != dice[1]))
                prize = 1000 + dice[0] * 100;
        }
        play[i] = prize;
    }
    for (i = 0; i < player; i++)
    {
        if (M < play[i])
            M = play[i];
    }
    printf("%d", M);

    return 0;
}