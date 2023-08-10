class Solution {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        char aux;

        while(i < j){
            if(s[i] != s[j]){
                aux = s[i];
                s[i] = s[j];
                s[j] = aux;
            }

            i++;
            j--;
        }
    }
}
