#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n, int k) {
    
    int free = 0;
    
    free = k-n/10;
    int answer = (n*12000) + (free*2000);
    return answer;
}