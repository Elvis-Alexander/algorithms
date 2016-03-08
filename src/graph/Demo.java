package graph;

public class Demo {
    public static void main(String[] args) {
        Graph graph = new Graph();
        Vertex[] vertices = new Vertex[5];
        for (int i = 0; i < vertices.length; i++) {
            vertices[i] = new Vertex("" + i);
            graph.addVertex(vertices[i], true);
        }

        for(int i = 0; i < vertices.length - 1; i++){
            for(int j = i + 1; j < vertices.length; j++){
                graph.addEdge(vertices[i], vertices[j]);
                graph.addEdge(vertices[i], vertices[j]);
                graph.addEdge(vertices[j], vertices[i]);
            }
        }


        for (int i = 0; i < vertices.length; i++) {
            System.out.println(vertices[i]);
            for (int j = 0; j < vertices[i].getNumOfEdges(); j++) {
                System.out.println(vertices[i].getEdge(j));
            }
            System.out.println();
        }
    }
}
