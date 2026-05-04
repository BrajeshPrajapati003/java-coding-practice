# Adjacency Matrix
class GraphMatrix:
    def __init__(self, n):
        self.n = n
        self.graph = [[0]*n for _ in range(n)]

    def add_edge(self, u, v):
        self.graph[u][v] = 1
        self.graph[v][u] = 1  # remove for directed

    def print_graph(self):
        for row in self.graph:
            print(row)

# Adjacency List
class GraphList:
    def __init__(self, n):
        self.n = n
        self.graph = [[] for _ in range(n)]

    def add_edge(self, u, v):
        self.graph[u].append(v)
        self.graph[v].append(u)  # remove for directed

    def print_graph(self):
        for i in range(self.n):
            print(i, "->", self.graph[i])


# Weighted Graph
graph = [[] for _ in range(n)]

graph[u].append((v, weight)) # add edge

