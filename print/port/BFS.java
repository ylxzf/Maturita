import java.util.*;

public class BFS {
    // This method will perform BFS on the graph starting from the given start node
    public static void bfs(Map<Integer, List<Integer>> graph, int start) {
        // Queue to manage nodes to visit
        Queue<Integer> queue = new LinkedList<>();
        
        // Set to keep track of visited nodes
        Set<Integer> visited = new HashSet<>();
        
        // Start with the start node
        queue.add(start);
        visited.add(start);
        
        // Process the queue
        while (!queue.isEmpty()) {
            // Get the current node
            int currentNode = queue.poll();
            System.out.print(currentNode + " ");  // Process the current node
            
            // Get all the neighbors of the current node
            List<Integer> neighbors = graph.get(currentNode);
            
            // Explore all unvisited neighbors
            for (int neighbor : neighbors) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);  // Add to the queue for future processing
                }
            }
        }
    }

    public static void main(String[] args) {
        // Create a graph using an adjacency list representation
        Map<Integer, List<Integer>> graph = new HashMap<>();
        
        graph.put(1, Arrays.asList(2, 3, 4));
        graph.put(2, Arrays.asList(1));
        graph.put(3, Arrays.asList(1, 6));
        graph.put(4, Arrays.asList(1, 5));
        graph.put(5, Arrays.asList(4, 6, 7));
        graph.put(6, Arrays.asList(3, 5, 7));
        graph.put(7, Arrays.asList(5, 7));
        
        // Perform BFS starting from node 0
        System.out.println("BFS Traversal starting from node 1:");
        bfs(graph, 1);
    }
}
