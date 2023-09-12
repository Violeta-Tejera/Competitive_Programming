#!/bin/python3

import os
import sys


#
# Complete the catAndMouse function below.
#
def catAndMouse(x, y, z):
    distance_cat_a = abs(x-z)
    distance_cat_b = abs(y-z)
    
    if distance_cat_a > distance_cat_b:
        return "Cat B"
    elif distance_cat_a == distance_cat_b:
        return "Mouse C"
    else:
        return "Cat A"
    


if __name__ == '__main__':
    f = open(os.environ['OUTPUT_PATH'], 'w')

    q = int(input())

    for q_itr in range(q):
        xyz = input().split()

        x = int(xyz[0])

        y = int(xyz[1])

        z = int(xyz[2])

        result = catAndMouse(x, y, z)

        f.write(result + '\n')

    f.close()
