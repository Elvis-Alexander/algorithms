package graph;

public class Edge {
    private Vertex vertex1, vertex2;
    private int weight;

    public Edge(Vertex v1, Vertex v2) {
        this(v1, v2, 1);
    }
    public Edge(Vertex v1, Vertex v2, int weight) {
        this.vertex1 = (v1.getLabel().compareTo(v2.getLabel()) <= 0) ? v1 : v2;
        this.vertex2 = (this.vertex1 == v1) ? v2 : v1;
    }

    public Vertex getNeighbor(Vertex current) {
        if(!(current.equals(vertex1) || current.equals(vertex2))) {
            return null;
        }
        return (current.equals(vertex1)) ? vertex2 : vertex1;
    }

    public int compareTo(Edge other) {
        return this.weight - other.getWeight();
    }
    public String toString() {
        return "({" + vertex1 + ", " + vertex2 + "}, " + weight + ")";
    }
    public int hashCode() {
        return (vertex1.getLabel() + vertex2.getLabel()).hashCode();
    }
    public boolean equals(Object o) {
        if(!(o instanceof  Edge)) {
            return false;
        }
        Edge e = (Edge)o;
        return this.vertex1.equals(e.vertex1) && this.vertex2.equals(e.vertex2);
    }


    public Vertex getVertex1() {
        return this.vertex1;
    }
    public Vertex getVertex2() {
        return this.vertex2;
    }
    public int getWeight() {
        return weight;
    }
}