/* struct2.c: Illustrates nested structures */
#include <stdio.h>
#include <string.h> 

struct Hitter {
    char last[16];  
    char first[11];
    int home_runs;
    int year;
};  

struct HallOfFame {
    struct Hitter players[10];
    int nPlayers;
};

int main() {
    struct HallOfFame hr;
    int i;
    hr.nPlayers = 0;
    
    /* Insert first player */
    strcpy(hr.players[hr.nPlayers].last, "Ruth");
    strcpy(hr.players[hr.nPlayers].first, "Babe");
    hr.players[hr.nPlayers].home_runs = 60;
    hr.players[hr.nPlayers++].year = 1927;
    
    /* Insert next player */
    strcpy(hr.players[hr.nPlayers].last, "Maris");
    strcpy(hr.players[hr.nPlayers].first, "Roger");
    hr.players[hr.nPlayers].home_runs = 61;
    hr.players[hr.nPlayers++].year = 1961;

    /* Print players in hr: */
    for (i = 0; i < hr.nPlayers; ++i)
        printf("%d: {%s, %s, %d}\n",
                hr.players[i].year,
                hr.players[i].last,
                hr.players[i].first,
                hr.players[i].home_runs);
    return 0;
}

//第32行++的作用范围
//第13行定义array如何确定array中元素的数据类型（在此处是Hitter）