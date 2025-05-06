import java.util.*;

public class DFS {
    // This method will perform DFS on the graph starting from the given start node using a stack
    // It always explores the smallest unvisited neighbor first
    public static void dfs(Map<Integer, List<Integer>> graph, int start) {
        // Stack to manage nodes to visit
        Stack<Integer> stack = new Stack<>();
        
        // Set to keep track of visited nodes
        Set<Integer> visited = new HashSet<>();
        
        // Start with the start node
        stack.push(start);
        
        while (!stack.isEmpty()) {
            // Pop the top node from the stack
            int currentNode = stack.pop();
            
            // If the node hasn't been visited yet
            if (!visited.contains(currentNode)) {
                visited.add(currentNode);
                System.out.print(currentNode + " ");  // Process the current node
                
                // Get all the neighbors of the current node
                List<Integer> neighbors = graph.get(currentNode);
                
                // Sort the neighbors to always visit the smallest one first
                Collections.sort(neighbors);
                
                // Push all unvisited neighbors onto the stack (in reverse order)
                for (int i = neighbors.size() - 1; i >= 0; i--) {
                    int neighbor = neighbors.get(i);
                    if (!visited.contains(neighbor)) {
                        stack.push(neighbor);
                    }
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
        
        // Perform DFS starting from node 1
        System.out.println("DFS Traversal starting from node 1:");
        dfs(graph, 1);
    }
}
