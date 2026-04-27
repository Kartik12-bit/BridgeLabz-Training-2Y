/*Problem 1: Social Network Connection
Scenario: You are building a social networking application. Users are represented as vertices,
and friendships are undirected edges. Given a list of friendships, you need to determine:
a) How to represent this network efficiently b) Find all friends of a given user c) Determine if two
users are directly connected d) Find the degree of separation between two users (shortest path)*/


// 1. Appropriate Graph Representation: Adjacency List


//2. Algorithm to Find All Friends of Alice
FindFriends(user):
   return graph[user]

// 3. Check if Bob and Eve are Directly Connected

IsConnected(u, v):
   if v in graph[u]:
       return True
   else:
       return False


// 4. Find Shortest Path Between Alice and Eve

BFS(start, target):
   queue = [start]
   visited = set()
   parent = map()

   while queue not empty:
       node = dequeue()

       for each neighbor:
           if not visited:
               parent[neighbor] = node
               enqueue(neighbor)

   reconstruct path 