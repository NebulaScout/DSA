import java.util.LinkedList;
import java.util.List;

public class Vertex<T> {
    private final T data;
    private boolean visited;

    public Vertex(T data) {
        this.data = data;
    }

    private List<Vertex<T>> neighbors = new LinkedList<>();

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public T getData() {
        return data;
    }

    public List<Vertex<T>> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(List<Vertex<T>> neighbors) {
        this.neighbors = neighbors;
    }
}
