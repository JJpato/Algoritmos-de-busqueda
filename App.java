import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DFS dfs = new DFS();
        Vertex a = new Vertex("a");
        Vertex b = new Vertex("b");
        Vertex c = new Vertex("c");
        Vertex d = new Vertex("d");
        Vertex e = new Vertex("e");
        Vertex f = new Vertex("f");
        Vertex g = new Vertex("g");
        Vertex s = new Vertex("s");

        
        //se tiene que ir poniendo de derecha a izquierda para que empiece a leer de izquierda a derecha
        s.addNeighbour(a); 
        s.addNeighbour(d); 
        a.addNeighbour(b);
        a.addNeighbour(d);
        d.addNeighbour(a);
        d.addNeighbour(e);
        e.addNeighbour(b);
        e.addNeighbour(f);
        b.addNeighbour(c);
        b.addNeighbour(e);
        f.addNeighbour(g);        

        System.out.println("-------------------Busqueda primero en profuncidad-------------------------");
        System.out.print("\nIngrese el vertice a buscar: ");
        Vertex vSearsh = new Vertex(scan.nextLine());

        System.out.println("\nResultados de busqueda: ");

        dfs.dfs(s, vSearsh);

    }
}
