package nodes;

public class Nodes<T> {

    private T content;
    private Nodes<T> nextNode;

    public Nodes(T content) {
        this.nextNode = null;
        this.content = content;
    }

    public T getContent() {
        return content;
    }
    public void setContent(T content) {
        this.content = content;
    }

    public Nodes<T> getNextNode() {
        return nextNode;
    }
    public void setNextNode(Nodes<T> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "No {" +
                "content='" + content + '\'' +
                '}';
    }
}
