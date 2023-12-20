#include <stdio.h>
#include <stdbool.h>

void comenPan(int numSillas){
    char mesa[1001];
    int i = 0;

    // Variables para indicar si hay alguien que ha empezado por la derecha, o por la izquierda (respectivamente)
    bool personaDerecha = false;
    bool personaIzquierda = false; 

    scanf(" %s", mesa);

    for(i = 0; i < numSillas; i++){

        if(mesa[i] != '.'){
            if(mesa[i] == 'D'){
                personaDerecha =  true;
            }else{
                personaIzquierda = true;
            }

            if(personaDerecha == true && personaIzquierda == true){
                printf("ALGUNO NO COME\n");
                return;
            }
        }
    }

    printf("TODOS COMEN\n");
    return;
}

int main(){
    int numSillas = 0;
    char* ret = NULL;

    while(1){
        scanf("%d", &numSillas);
        if(numSillas == 0) return 0;
        comenPan(numSillas);        
    }

    return 0;
}