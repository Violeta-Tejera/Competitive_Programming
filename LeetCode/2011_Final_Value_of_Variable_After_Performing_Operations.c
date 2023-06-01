int finalValueAfterOperations(char ** operations, int operationsSize){
    if(!operations || operationsSize < 0) return 0;

    int r = 0;

    for(int i = 0; i < operationsSize; i++){
        if(operations[i][1] == '+') r++;
        else r--;
    }

    return r;
}
