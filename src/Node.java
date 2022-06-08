public class Node {
    private int id;
    public Node(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public boolean equals(Node other){
        return other.getId() == id;
    }

    public Edge addEdge(Node dst){
        return new Edge(this, dst);
    }
}
