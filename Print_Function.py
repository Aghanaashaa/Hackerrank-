#The included code stub will read an integer,n, from STDIN.

#Without using any string methods, try to print the following:
#123...n
#Note that "..." represents the consecutive values in between.

from __future__ import print_function

if __name__ == '__main__':
    print(*range(1, int(input()) + 1), sep="")  
