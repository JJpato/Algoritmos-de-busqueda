import java.util.Queue;
import java.util.LinkedList;

public class BFS {
    private Queue<Vertex> queue;
    
    public BFS(){
        queue = new LinkedList<Vertex>();
    }

    public void bfs(Vertex rootVertex, Vertex search){
        queue.offer(rootVertex);
        rootVertex.setVisited(true);

        while(!queue.isEmpty()){
            //Tomar el vertice actual
            Vertex actualVertex = queue.poll();
            System.out.print(actualVertex.Name());
            if(search.Name().equals(actualVertex.Name())){
                return;
            }
            for(Vertex v : actualVertex.getNeighbordList()){
                if(!v.isVisited()){
                    v.setVisited(true);
                    queue.offer(v);
                }
            }
        }
    }
}