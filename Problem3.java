/*Problem 3: City Road Network
Scenario: A navigation system needs to model a city’s road network. Intersections are vertices,
roads are weighted edges (weights represent distance in km). Some roads are one-way.
Input Example:
Intersections: [A, B, C, D, E]
Roads:
- A → B (5 km, one-way)
- B ↔ C (3 km, two-way)
- A ↔ D (7 km, two-way)
- D → E (2 km, one-way)
- C → E (4 km, one-way)
Tasks:
1. Choose and justify appropriate graph representation (directed/undirected, weighted) : Weighted Directed Graph using Adjacency List
2. Design algorithm to find all intersections reachable from A
DFS(node):
   mark visited
   for each neighbor:
      if not visited:
         DFS(neighbor)
3. Using BFS, find the path with fewest turns from A to E
4. Explain why DFS might not find the shortest distance path: 
because DFS explores one branch deeply first. */