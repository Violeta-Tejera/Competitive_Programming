# Enter your code here. Read input from STDIN. Print output to STDOUT
from math import floor

height, width = map(int, input().split(" "))
shape = ".|."

def main():
    nlines = floor(height/2)

    # Top pyramid
    top_pyramid = generate_pyramid(nlines, width, False)

    # Middle line
    align_size = int((width - 7) / 2)
    middle_line = "-" * align_size + "WELCOME" + "-" * align_size + "\n"

    # Bottom pyramid
    bottom_pyramid = generate_pyramid(nlines, width, True)

    # Final product
    doormat = top_pyramid + middle_line + bottom_pyramid
    print(doormat)

def generate_pyramid(nlines, width, reverse = False):
    if reverse == False:
        f = 0
        l = nlines
        step = 1
    else:
        f = nlines -1
        l = -1
        step = -1

    pyramid = ""

    for i in range(f, l, step):
        nShapes = int(i*2 + 1)
        nScores = int((width - nShapes*3) / 2)

        pyramid += (nScores * "-" + nShapes * shape + nScores * "-" + "\n")

    return pyramid

main()