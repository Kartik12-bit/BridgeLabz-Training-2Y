/*Problem 2: Course Prerequisite System
Scenario: A university needs to validate their course prerequisite structure. Courses are
vertices, and directed edges represent prerequisites (edge from A to B means A must be taken
before B).

Input Example:
Courses: [CS101, CS102, CS201, CS202, MATH101]
Prerequisites:
- CS101 → CS102
- CS101 → CS201
- CS102 → CS202
- MATH101 → CS201
Tasks:
1. Represent this prerequisite system using appropriate graph structure. : Adjacency List (Directed Graph)
2. Design an algorithm to detect if there’s a circular dependency (cycle detection)
DFS(node):
   mark visited
   mark node in recursion stack

   for each neighbor:
      if not visited:
         DFS(neighbor)
      else if neighbor in recursion stack:
         Cycle Found

   remove node from recursion stack
3. Design an algorithm to determine all courses that must be completed before taking
CS202 : Reverse DFS
4. Generate a valid order in which all courses can be taken (topological sort concept) : Topological Sorting */


