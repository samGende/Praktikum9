public class TestGraph {
    public static void main(String[] args) {
        String path = args[0];
        int start = 0;
        int ziel = 0;
        try {
            start = Integer.parseInt(args[1]);
            ziel = Integer.parseInt(args[2]);
        } catch (NumberFormatException e){
            System.out.println("eingabe war nicht ein zahl");
        }

        Graph graph = Graph.fromFile(path);
        System.out.println(graph.toString());
        int breite = graph.breitenSuche(start, ziel);
        if(breite == Integer.MAX_VALUE){
            System.out.println("Die Ziel und start Knoten sind nich verbunden");
        }else {
            System.out.println("Ziel und start Knoten sind " + breite + " weit weg.");
        }

    }
}
