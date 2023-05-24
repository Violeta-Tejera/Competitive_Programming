/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* getConcatenation(int* nums, int numsSize, int* returnSize){
    *returnSize = 2*numsSize;
    int* retArray = (int*) malloc(*returnSize*sizeof(int));
    if(!retArray) return NULL;

    for(int i = 0; i < numsSize; i++){
        retArray[i] = nums[i];
        retArray[i+numsSize] = nums[i]; 
    }

    return retArray;
}
