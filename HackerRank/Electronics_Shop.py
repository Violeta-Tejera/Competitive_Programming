#!/bin/python3

import os
import sys

#
# Complete the getMoneySpent function below.
#
def getMoneySpent(keyboards, drives, b):
    valid_combinations = []
    
    # O(len(k)+len(d)) solution (We ought to considerate all possible combinations)
    for k in keyboards:
        for d in drives:
            price = k+d
            if price <= b:
                valid_combinations.append(price)
    
    if len(valid_combinations) == 0:
        return -1
    
    return max(valid_combinations)
             
    
    

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    bnm = input().split()

    b = int(bnm[0])

    n = int(bnm[1])

    m = int(bnm[2])

    keyboards = list(map(int, input().rstrip().split()))

    drives = list(map(int, input().rstrip().split()))

    #
    # The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
    #

    moneySpent = getMoneySpent(keyboards, drives, b)

    fptr.write(str(moneySpent) + '\n')

    fptr.close()
