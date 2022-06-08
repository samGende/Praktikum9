import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Graph {
    private Node[] nodes;
    private int numNodes;
    private int numEdges;

    public Graph(){
        this.nodes = new Node[100];
        this.numNodes = 0;
        this.numEdges = 0;
    }

    public static Graph fromFile(String filepath){
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(filepath);
            bufferedReader = new BufferedReader(fileReader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String p = "";
        do while (p.ge)
        try {
            p = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int numNodes = Integer.parseInt(p);
        int numEdges = Integer.parseInt(p);
        System.out.println(numNodes);
        System.out.println(numEdges);

        return new Graph();

    }

    public boolean addEdge(int src, int dst){
        Node srcNode = getNode(src);
        Node dstNode = getNode(dst);
        if(srcNode==null || dstNode == null){
            return false;
        }
        srcNode.addEdge(dstNode);
        return true;
    }

    public Node getNode(int id){
        if(id >= numNodes || numNodes == 0){
            return null;
        }
        for(int i = 0; i < numNodes; i++){
            if(nodes[i].getId() == id){
                return nodes[i];
            }
        }
        return null;
    }

    public boolean contains(int id){
        if(id >= numNodes || numNodes == 0){
            return false;
        }
        return true;
    }

    public int getNumNodes() {
        return numNodes;
    }

    public int getNumEdges() {
        return numEdges;
    }
}
