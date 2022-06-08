public class TestGraph {
    public static void main(String[] args) {
        Graph graph = Graph.fromFile("/Users/samgende/IdeaProjects/Praktikum9/src/graphen/BspGraphKlein.graph");
        System.out.println(graph.toString());
        System.out.println(graph.breitenSuche(0, 4));

    }
}
