graph = {'A': set(['B', 'C']),
         'B': set(['A', 'D', 'E']),
         'C': set(['A', 'F']),
         'D': set(['B']),
         'E': set(['B', 'F']),
         'F': set(['C', 'E'])}


def bfs(graph,start):
	queue = [start]
	visited = set()
	visited.add(start)
	while queue:
		vertex = queue.pop(0)
		if vertex not in visited:
			visited.add(vertex)
			queue.extend(graph[vertex]-visited)
	return visited

print bfs(graph,'A')

def bfs_path(graph,start,goal):
	queue = [(start,[start])]
	while queue:
		(vertex,path) = queue.pop(0)
		for next in graph[vertex] - set(path):
			if next == goal:
				yield path + [next]
			else:
				queue.append((next,path+[next]))



print list(bfs_path(graph,'A','F'))

def shortest_path(graph,start,goal):
	try:
		return next(bfs_path(graph,start,goal))
	except StopIteration:
		return None

print shortest_path(graph,'A','F')