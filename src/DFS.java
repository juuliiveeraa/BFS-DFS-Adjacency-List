import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class DFS <T> {
    private List<T> vertices;
    private List<List<Integer>> edges;

    public List<T> depthFirst(int start) {
        List<T> answer = new ArrayList<T>(vertices.size());
        Stack<Integer> stack = new Stack<Integer>(); 
        boolean[] visited = new boolean[vertices.size()];

        Arrays.fill(visited,false);

        while(stack.size() > 0) {
            int next = stack.pop();
            answer.add(vertices.get(next));
            List<Integer> edgesVertex = edges.get(next);
            
            for(int i:edgesVertex) {
                if(!visited[i]) {
                    stack.push(i);
                    visited[i] = true;
                }
            }
        }

        return answer;
    }
}