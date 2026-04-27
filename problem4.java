/*Problem 4: Island Counter
Scenario: You have a 2D grid map where 1 represents land and 0 represents water. An island
is formed by connecting adjacent lands horizontally or vertically. You need to count the total
number of islands.
Input Example:
Grid:
1 1 0 0 0
1 1 0 0 1
0 0 1 0 1
0 0 0 1 1

Tasks:
1. Model this problem as a graph (what are vertices and edges?)
Each land cell (1) is a vertex.
2. Design algorithm using DFS to count islands
count = 0

for each cell:
   if grid[i][j] == 1 and not visited:
      DFS(i,j)
      count++

DFS(i,j):
   if out of bounds or water or visited:
      return

   mark visited

   visit up, down, left, right  
3. Design algorithm using BFS to count islands
count = 0

for each cell:
   if land and unvisited:
      BFS(i,j)
      count++

BFS(i,j):
   queue add cell

   while queue not empty:
      pop cell
      check 4 neighbors
4. Analyze time and space complexity of both approaches

T(n)=O(mn)
5. Can diagonal connections be considered? How would that change the solution? 
Then 8 directions instead of 4:
Up
Down
Left
Right
Top-left
Top-right
Bottom-left
Bottom-right
In DFS/BFS, check 8 neighbors instead of 4.*/