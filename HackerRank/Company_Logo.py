#!/bin/python3

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    s = input()

occ = {} # Dictionary to track the occurrence of each different letter
    
for letter in s:
    if letter in occ:
        occ[letter] += 1
    else:
        occ[letter] = 1
        
# Sorting the values
occ = dict(sorted(occ.items(), key = lambda x:x[1], reverse = True))

# Output

for i in range(0, 3):
    print(str(list(occ) [i]) + " " + str(list(occ.values()) [i]))
