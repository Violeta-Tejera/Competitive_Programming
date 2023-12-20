#include <stdio.h>

int main(){
    int quantity = 0;
    int current_number = 0;
    int i = 0;

    scanf("%d", &quantity);

    for(i = 0; i < quantity; i++){
        scanf("%d", &current_number);

        if(current_number >= 0){
            current_number--;
        }
        
        printf("%d\n", current_number);
    }

    return 0;
}