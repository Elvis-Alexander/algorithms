package graph;

import java.util.ArrayList;

public class Vertex {
    private String label;
    private ArrayList<Edge> edgeList;

    public Vertex(String l) {
        this.label = l;
        this.edgeList = new ArrayList<Edge>();
    }

    public void addEdge(Edge e) {
        if(!this.edgeList.contains(e)) {
            this.edgeList.add(e);
        }
    }
    public boolean containsEdge(Edge e) {
        return this.edgeList.contains(e);
    }
    public Edge getEdge(int i) {
        return this.edgeList.get(i);
    }
    public Edge removeEdge(int i) {
        return this.edgeList.remove(i);
    }
    public void removeEdge(Edge e) {
        this.edgeList.remove(e);
    }
    public int getNumOfEdges() {
        return this.edgeList.size();
    }

    public String getLabel() {
        return this.label;
    }
    public String toString() {
        return "Vertex: " + label;
    }

    public int hashCode() {
        return this.label.hashCode();
    }
    public boolean equals(Object o) {
        if(!(o instanceof  Vertex)) {
            return false;
        }
        Vertex v = (Vertex)o;
        return this.label.equals(v.label);
    }
    public ArrayList<Edge> getEdgeList() {
        return new ArrayList<Edge>(this.edgeList);
    }

}