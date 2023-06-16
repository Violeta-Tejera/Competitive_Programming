char * toLowerCase(char * s){
    if(!s) return NULL;
    int size = strlen(s);

    for(int i = 0; i < size; i++){
        if(s[i] <= 90) s[i] += 32;
    }

    return s;
}
