# Practice 2011 - 05: Robot in a Maze

## Background
A robot is stuck in a maze with multiple exits and needs to find the shortest
path out. The maze can be represented as a two dimensional grid where each space
is either a wall, which the robot cannot go through, an exit, or one of the
goals. The robot can only move one space at a time, and at each move it can only
move either horizontally or vertically, not diagonally. It can exit the maze
from any exit, but it needs to start at the specified place. What is the fewest
number of moves the robot can make to exit from the maze?

## Description

### Input
The input will be given first by a number that tells the number of different
mazes in the input file. Following that, for each data set, there will be two
integers, R and C. The first number, R, represents the number or rows in the
maze, and the second number, C, representing the number of columns. The
following R lines will each be a series of characters representing spaces on the
grid for that row. An X will represent an obstacle, and O (the letter) will
represent an open space that the robot can move. An S will represent the
starting location of the robot. The goals in the maze will be given by the
letter G. There may be more than one goal.

### Output
The output should be if the robot can get out of the maze:
```
"Shortest Path: t"
```
Where t is an integer representing the length of the shortest path.
If there is no way out of the maze, the output should be:
```
"No Exit"
```
Each line of output should be printed at the end of the program.

## Sample
### Input
```
3
7 8
XXXXXXXX
XSOOXOOX
XOXOOOOX
XOXXXOOX
XOXOXXOX
XOOOXOOX
XXXXXGXX
4 4
XGXX
XSOX
XOOX
XGGX
4 4
XXXX
XSOX
XXXX
XXGX
```

### Output
```
Shortest Path: 11
Shortest Path: 1
No Exit
```
