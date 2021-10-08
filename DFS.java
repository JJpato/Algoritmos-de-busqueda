import java.util.Stack;
//import java.util.List;

public class DFS {
    private Stack<Vertex> stack;
    
    public DFS(){
        this.stack = new Stack<>();
    }
    /*
    public void dfs(List<Vertex> vertexList){
        for(Vertex v : vertexList){
            if(v.isVisited()){
                v.setVisited(true);
                dfsWithStack(v);
            }
        }
    }*/
    public void dfs(Vertex rootVertex, Vertex search){
        this.stack.add(rootVertex);
        rootVertex.setVisited(true);

        while(!stack.isEmpty()){
            //Tomar el vertice actual
            Vertex actualVertex = this.stack.pop();
            System.out.print(actualVertex.Name());
            if(search.Name().equals(actualVertex.Name())){
                return;
            }
            for(Vertex v : actualVertex.getNeighbordList()){
                if(!v.isVisited()){
                    v.setVisited(true);
                    this.stack.push(v);
                }
            }
        }
    }
    /*
    public void dfs(List<Vertex> vertexList, Vertex root, Vertex search){
        stack.push(root);
        root.setVisited(true);
        while(!stack.empty()){
            Vertex actualVertex = stack.pop();
            for(Vertex v : actualVertex.getNeighbordList()){
                //si todavia no ha sido visitado
                if(!v.isVisited()){
                    v.setVisited(true);
                    //agregar vecino a la pila
                    stack.push(v);

                }
            }

        }
    }*/


}
