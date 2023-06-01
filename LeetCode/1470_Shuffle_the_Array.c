/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* shuffle(int* nums, int numsSize, int n, int* returnSize){
    if(!nums || numsSize < 0 || !returnSize) return NULL;

    *returnSize = n*2;

    int *retArr = (int*) malloc(*returnSize*sizeof(int));
    if(!retArr) return NULL;

    int m = 0;

    for(int i = 0; i < *returnSize; i++){
        if(i%2 == 0){
            retArr[i] = nums[m];
            m++; 
        }else{
            retArr[i] = nums[n];
            n++;
        }
    }

    return retArr;
}
