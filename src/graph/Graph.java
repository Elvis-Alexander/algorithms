package graph;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    private HashMap<String, Vertex> vertices;
    private HashMap<Integer, Edge> edges;

    public Graph() {
        this.vertices = new HashMap<String, Vertex>();
        this.edges = new HashMap<Integer, Edge>();
    }
    public Graph(ArrayList<Vertex> vs) {
        this();
        for(Vertex v: vs) {
            this.vertices.put(v.getLabel(), v);
        }
    }
    public boolean addEdge(Vertex v1, Vertex v2) {
        return addEdge(v1, v2, 1);
    }
    public boolean addEdge(Vertex v1, Vertex v2, int w) {
        if(v1.equals(v2)) {
            return false;
        }
        Edge newEdge = new Edge(v1, v2, w);
        if(edges.containsKey(newEdge.hashCode())) {
            return false;
        }
        edges.put(newEdge.hashCode(), newEdge);
        v1.addEdge(newEdge);
        v2.addEdge(newEdge);
        return true;
    }
    public Edge removeEdge(Edge e) {
        e.getVertex1().removeEdge(e);
        e.getVertex2().removeEdge(e);
        return this.edges.remove(e.hashCode());
    }
    public boolean containsVertex(Vertex v) {
        return this.vertices.get(v.getLabel()) != null;
    }
    public Vertex getVertex(String label) {
        return vertices.get(label);
    }
    public boolean addVertex(Vertex v, boolean overWriteExisting) {
        Vertex current = this.vertices.get(v.getLabel());
        if(current != null) {
            if(!overWriteExisting){
                return false;
            }
            while(current.getNumOfEdges() > 0) {
                this.removeEdge(current.getEdge(0));
            }
        }
        vertices.put(v.getLabel(), v);
        return true;
    }





}