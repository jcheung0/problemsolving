graph = {'A': set(['B', 'C']),
         'B': set(['A', 'D', 'E']),
         'C': set(['A', 'F']),
         'D': set(['B']),
         'E': set(['B', 'F']),
         'F': set(['C', 'E'])}

def dfs(graph, start):
    visited, stack = set(), [start]
    while stack:
        vertex = stack.pop()
        if vertex not in visited:
            visited.add(vertex)
            stack.extend(graph[vertex] - visited)
    return visited

def dfs_two(graph,start,visited = None):
    if visited is None:
        visited = set()
    visited.add(start)
    for next in graph[start] - visited:
        dfs_two(graph,next,visited)
    return visited


def dfs_paths(graph,start,goal):
    stack = [(start,[start])]
    while stack:
        (vertex,path) = stack.pop();
        for next in graph[vertex] - set(path):
            if next == goal:
                yield path + [next]
            else:
                stack.append((next,path + [next]))


def dfs_paths_two(graph, start, goal, path=None):
    if path is None:
        path = [start]
    if start == goal:
        yield path
    for next in graph[start] - set(path):
        yield dfs_paths_two(graph, next, goal, path + [next])

#print dfs_two(graph,'C')

print list(dfs_paths_two(graph, 'C', 'F'))