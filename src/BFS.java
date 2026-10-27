import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS <T> {
    
    private List<T> vertices;
    private List<List<Integer>> edges;
    
    public List<T> breadthFirst(int start) {

        List<T> answer = new ArrayList<T>(vertices.size());
        Queue<Integer> queue = new LinkedList<Integer>();
        boolean[] visited = new boolean[vertices.size()];

        Arrays.fill(visited, false);
        queue.add(start);

        visited[start] = true;

        while(queue.size() > 0) {
            int next = queue.remove();
            
            answer.add(vertices.get(next));

            List<Integer> edgesVertex = edges.get(next);

            for(int i:edgesVertex) {
                if(!visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }

        return answer;
    }
}